package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by saurabh.agrawal on 28/01/16.
 */
public class TimeRange {
    @JsonProperty
    Date lowerBound;

    @JsonProperty
    Date upperBound;
}
