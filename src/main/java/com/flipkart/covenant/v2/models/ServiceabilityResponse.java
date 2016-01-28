package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
class ServiceabilityResponse {

    @ApiModelProperty(value = "A service defintion")
    @JsonProperty(required = true)
    ServiceOption service;

    @ApiModelProperty(value = "The time range in which this service can be fulfilled")
    @JsonProperty
    TimeRange promiseTime;

    @ApiModelProperty(value = "The cost of fulfilling this service", example = "40")
    @JsonProperty
    int price;
}
