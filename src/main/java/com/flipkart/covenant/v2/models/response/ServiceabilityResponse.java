package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
@Data
public class ServiceabilityResponse {

    @ApiModelProperty(value = "A service defintion")
    @JsonProperty
    private ServiceOption service;

    @ApiModelProperty("Whether the service can be provided")
    @JsonProperty
    private DetailedResponse<Boolean> isServiceable;

    @ApiModelProperty("The time range in which this service can be fulfilled")
    @JsonProperty
    private DetailedResponse<TimeRange> promiseTime;

    @ApiModelProperty(value = "The cost of fulfilling this service", example = "40")
    @JsonProperty
    private int price;

    @ApiModelProperty("The cutoff after which this promised option must be recomputed")
    @JsonProperty
    private Date invalidAfter;
}
