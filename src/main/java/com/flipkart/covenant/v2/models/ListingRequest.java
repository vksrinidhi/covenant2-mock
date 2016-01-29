package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
class ListingRequest {

    @ApiModelProperty(value = "Any client chosen id, unique in the request scope, that " +
            "should be used to corelate the request and response",
            example = "listing-request-1")
    @JsonProperty(required = true)
    String id;

    @JsonProperty(required = true)
    @ApiModelProperty(example = "LSTMOBE6KK93JG5WKB27FPDX7")
    String listingId;

    @JsonProperty(required = true)
    @ApiModelProperty(value = "Selling price of the listing",
            example = "10999")
    int price;

    @JsonProperty
    @ApiModelProperty(value = "Number of units of the listing",
            allowableValues = "range[1, infinity]", example = "1")
    int quantity = 1;

    @JsonProperty
    AvailabilityRequest availabilityRequest = new AvailabilityRequest();

    @JsonProperty
    @ApiModelProperty("The services for which promise is requested")
    ServiceRequest serviceRequest = new ServiceRequest();

}
