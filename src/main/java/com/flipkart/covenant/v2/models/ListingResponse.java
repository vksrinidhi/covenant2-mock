package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
class ListingResponse { // extends EnumMap<Aspect, Promiseable> {

    @ApiModelProperty(value = "The id of the corresponding listing request",
            example = "listing-request-1")
    @JsonProperty(required = true)
    String listingRequestId;

    @ApiModelProperty(value = "The listing availability information")
    @JsonProperty
    AvailabilityResponse availability;

    @ApiModelProperty(value = "The list of services that can be offered")
    @JsonProperty
    List<ServiceabilityResponse> serviceability;

}
