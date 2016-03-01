package com.flipkart.covenant.v2.models.request;

/**
 * Created by srinidhi.vk on 23/02/16.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.covenant.v2.models.response.ServiceDefinition;
import com.flipkart.covenant.v2.models.response.TimeRange;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Describes the service option of a specific service that needs to be finalized.
 *
 * @see com.flipkart.covenant.v2.models.response.ServiceDefinition
 */
@Data
public class FinalizeServiceRequest {
    /**
     * A definition of the service being promised.
     */
    @ApiModelProperty(value = "A service defintion")
    @JsonProperty
    private ServiceDefinition service;

    /**
     * Optional. If specified, reservation is made only if promiseTime falls in the asked range
     *The time range in which this service should be fulfilled.
     */
    @ApiModelProperty("The time range in which this service can be fulfilled")
    @JsonProperty
    private TimeRange promiseTime;

    /**
     * Optional
     * The cost within which the service should be fulfilled.
     */
    @ApiModelProperty(value = "The cost within which the service should be fulfilled", example = "40")
    @JsonProperty
    private Integer cost;

}
