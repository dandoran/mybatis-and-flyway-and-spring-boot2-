package com.sample.demo.mapper;

import com.sample.demo.model.Station;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

/**
 * On Wednesday October 03, 2018 this glorious class was created
 * Created by Daniel Doran 10/3/18.
 */
@Mapper
public interface StationRepository {

    @Insert("INSERT INTO station(station_id, name, hd_enabled, call_sign) VALUES (#{stationId}, #{name}, #{hdEnabled}, #{callSign})")
    int addStation(Station station);

    @Delete("DELETE FROM station WHERE station_id = #{stationId}")
    int removeStation(String stationId);

    @Update("update station set name=#{name}, hd_enabled=#{hdEnabled}, call_sign=#{callSign} where station_id=#{stationId}")
    int updateStation(Station station);

    @Select("select * from station where station_id = #{stationId}")
    Station findByStationId(String stationId);

    @Select("select * from station where name = #{stationName}")
    Station findByStationName(String stationName);

    @Select("select * from station where hd_enabled = true")
    Collection<Station> findAllHDStations();

    @Select("select * from station")
    Collection<Station> findAll();
}
