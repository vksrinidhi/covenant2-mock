package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
class PolicyRequest {

    @JsonProperty(required = true)
    @ApiModelProperty(value = "Any client chosen id, unique in the request scope, that " +
            "should be used to corelate the request and error, if any.",
            example = "policy-request-1")
    String id;

    // list of ids referring to the ListingRequest::id
    @JsonProperty(required = true)
    @ApiModelProperty(value = "Listing request ids this policy should be applied to",
    example = "[listing-request-1, listing-request-2]")
    List<String> targetListingRequests;

    @JsonProperty(required = true)
    @ApiModelProperty(example = "{\"type\":\"shipTogether\"}")
    Policy policy;
}
