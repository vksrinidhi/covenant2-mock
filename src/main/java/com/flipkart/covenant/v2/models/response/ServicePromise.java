package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Describes the serviceability of a specific service.
 *
 * @see ServiceDefinition
 */
@Data
public class ServicePromise {

    /**
     * A definition of the service being promised.
     */
    @ApiModelProperty(value = "A service defintion")
    @JsonProperty
    private ServiceDefinition service;

    /**
     * Whether the service can be provided.
     */
    @ApiModelProperty("Whether the service can be provided")
    @JsonProperty
    private DetailedResponse<Boolean> isServiceable;

    /**
     * The time range in which this service can be fulfilled.
     */
    @ApiModelProperty("The time range in which this service can be fulfilled")
    @JsonProperty
    private DetailedResponse<TimeRange> promiseTime;

    /**
     * The cost of fulfilling this service.
     */
    @ApiModelProperty(value = "The cost of fulfilling this service", example = "40")
    @JsonProperty
    private int cost;

    /**
     * The cutoff after which this promised option must be recomputed.
     */
    @ApiModelProperty("The cutoff after which this promised option must be recomputed")
    @JsonProperty
    private Date invalidAfter;
}
