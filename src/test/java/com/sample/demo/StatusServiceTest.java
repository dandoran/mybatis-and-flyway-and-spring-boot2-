package com.sample.demo;

import com.sample.demo.model.Station;
import com.sample.demo.service.StationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * On Wednesday October 03, 2018 this glorious class was created
 * Created by Daniel Doran 10/3/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StatusServiceTest {

    private Station testStation = new Station("nyPower1051", "Power 1051", true, "105.1");
    private Station testStationHdDisabled = new Station("nyZ100", "Z 100", false, "100.3");

    @Autowired
    StationService stationService;

    @Before
    public void before() {
        stationService.findAll().stream().forEach(item -> stationService.removeStation(item.getStationId()));
    }

    @Test
    public void testCount() {
        stationService.addStation(testStation);
        assertEquals(1, stationService.findAll().size());
    }

    @Test
    public void testAdd() {
        stationService.addStation(testStation);
        Assert.assertEquals(testStation, stationService.findByStationName(testStation.getName()));
    }

    @Test
    public void testRemove() {
        stationService.addStation(testStation);
        assertEquals(1, stationService.findAll().size());
        stationService.removeStation(testStation.getStationId());
        assertEquals(0, stationService.findAll().size());

    }

    @Test
    public void testUpdate() {
        stationService.addStation(testStation);
        Assert.assertEquals(testStation, stationService.findByStationName(testStation.getName()));
        Station updatedStation = new Station(testStation.getStationId(), "nyz100", false, "100.3");
        stationService.updateStation(updatedStation);
        Assert.assertEquals(updatedStation, stationService.findByStationId(testStation.getStationId()));
    }

    @Test
    public void testHdEnabled() {
        stationService.addStation(testStation);
        stationService.addStation(testStationHdDisabled);
        assertEquals(1, stationService.findAllHDStations().size());
    }

    @Test
    public void findByName() {
        stationService.addStation(testStation);
        Assert.assertEquals(testStation, stationService.findByStationName(testStation.getName()));

    }

    @Test
    public void findByStationId() {
        stationService.addStation(testStation);
        Assert.assertEquals(testStation, stationService.findByStationId(testStation.getStationId()));
    }

}