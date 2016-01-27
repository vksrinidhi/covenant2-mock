package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
class ListingResponse { // extends EnumMap<Aspect, Promiseable> {

    @JsonProperty(required = true)
    String listingRequestId;

    @JsonProperty
    AvailabilityResponse availability;

    @JsonProperty
    List<ServiceabilityResponse> serviceability;

}
