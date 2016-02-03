package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
@Data
public class PolicyRequest {

    @JsonProperty(required = true)
    @ApiModelProperty(value = "Any client chosen id, unique in the request scope, that " +
            "should be used to corelate the request and error, if any.",
            example = "policy-request-1")
    private final String id;

    @JsonProperty(required = true)
    @ApiModelProperty(example = "{\"type\":\"shipTogether\"}")
    private final Policy policy;

    // list of ids referring to the ListingRequest::id
    @JsonProperty(required = true)
    @ApiModelProperty(value = "Listing request ids this policy should be applied to",
            example = "[listing-request-1, listing-request-2]")
    private final List<String> targetListingRequests;

}
