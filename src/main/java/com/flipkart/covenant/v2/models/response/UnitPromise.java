package com.flipkart.covenant.v2.models.response;

/**
 * Created by srinidhi.vk on 22/02/16.
 */

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Describe each unit of promise.
 */
@Data
public class UnitPromise {

    //TODO:: Client views to get a consolidated promise date and cost.
    /**
     * Id that uniquely identifies a unit promise. <p>
     */
    @JsonProperty(required = true)
    private String id;

    /**
     * The listing Id. <p>
     */
    @JsonProperty(required = true)
    private String listingId;

    /**
     * Reference id passed as part of finalize request. <p>
     */
    @JsonProperty(required = true)
    private String referenceId;

    /**
     * Plan id that refers to fulfilment plan. <p>
     */
    @JsonProperty(required = true)
    private String planId;

    /**
     * A definition of the service promised.
     */
    @ApiModelProperty(value = "Service definition of promised resources")
    @JsonProperty(required = true)
    private ServiceDefinition promisedService;

    /**
     * The time range in which this service can be fulfilled.
     */
    @ApiModelProperty("The time range in which this service can be fulfilled")
    @JsonProperty(required = true)
    private TimeRange promisedTime;

    /**
     * The cost of fulfilling this promise.
     */
    @ApiModelProperty(value = "The cost of fulfilling this promise", example = "40")
    @JsonProperty
    private int cost;

}
