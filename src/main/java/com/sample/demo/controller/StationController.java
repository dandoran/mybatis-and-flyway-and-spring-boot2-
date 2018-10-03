package com.sample.demo.controller;

import com.sample.demo.model.Station;
import com.sample.demo.service.StationService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * On Wednesday October 03, 2018 this glorious class was created
 * Created by Daniel Doran 10/3/18.
 */
@RestController
public class StationController {

    private StationService stationService;

    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping("/hdEnabled")
    public Collection<Station> getHdEnabledStations() {
        return stationService.findAllHDStations();
    }

    @GetMapping("/stationName/{name}")
    public Station getByStationName(@PathVariable String name) {
        return stationService.findByStationName(name);
    }

    @GetMapping("/stationId/{id}")
    public Station getByStationId(@PathVariable String id) {
        return stationService.findByStationId(id);
    }

    @DeleteMapping("/removeStation/{id}")
    public int removeByStationId(@PathVariable String id) {
        return stationService.removeStation(id);
    }

    @PostMapping("/addStation")
    public int addStation(@RequestBody Station station) {
        return stationService.addStation(station);
    }

    @PostMapping("/updateStation")
    public int updateStation(@RequestBody Station station) {
        return stationService.updateStation(station);
    }
}
