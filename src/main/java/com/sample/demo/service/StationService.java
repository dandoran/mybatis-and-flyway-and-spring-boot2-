package com.sample.demo.service;

import com.sample.demo.mapper.StationRepository;
import com.sample.demo.model.Station;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * On Tuesday October 03, 2018 this glorious class was created
 * Created by Daniel Doran 10/2/18.
 */
@Service
public class StationService {

    private StationRepository stationRepository;

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public int addStation(Station station) {
        return stationRepository.addStation(station);
    }

    public int removeStation(String stationId) {
        return stationRepository.removeStation(stationId);
    }

    public int updateStation(Station station) {
        return stationRepository.updateStation(station);
    }

    public Station findByStationId(String stationId) {
        return stationRepository.findByStationId(stationId);
    }

    public Station findByStationName(String stationName) {
        return stationRepository.findByStationName(stationName);
    }

    public Collection<Station> findAllHDStations() {
        return stationRepository.findAllHDStations();
    }

    public Collection<Station> findAll() {
        return stationRepository.findAll();
    }
}
