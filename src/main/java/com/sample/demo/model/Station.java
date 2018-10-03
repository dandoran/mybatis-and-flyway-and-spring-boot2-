package com.sample.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * On Tuesday October 03, 2018 this glorious class was created
 * Created by Daniel Doran 10/3/18.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Station {
    private String stationId;
    private String name;
    private boolean hdEnabled;
    private String callSign;
}
