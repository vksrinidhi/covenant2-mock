package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
class ServiceRequest {
    // TODO - should type be a single Aspect, a List<Aspect> (with ordering) or Set<Aspect> (without ordering)?
    @JsonProperty
    ServiceType type = ServiceType.forward;

    @JsonProperty
    Set<ServiceOption> filters;
}
