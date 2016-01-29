package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Set;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
class ServiceRequest {
    @JsonProperty
    @ApiModelProperty("Type of service requested")
    ServiceType type = ServiceType.FORWARD;

    @JsonProperty
    @ApiModelProperty("Filters to restrict the desired promise options. " +
            "If an attribute is set, only matching service options are computed.")
    Set<ServiceOption> filters;
}
