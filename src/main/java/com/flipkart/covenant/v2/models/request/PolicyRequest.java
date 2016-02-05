package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * A request for policies to be applied.
 */
@Data
public class PolicyRequest {

    /**
     * Any client chosen id, unique in the request scope, that should be used
     * to co-relate the {@code PolicyRequest} and {@code PolicyResponse}. <p>
     * <b>Required.</b>
     */
    @JsonProperty(required = true)
    @ApiModelProperty(value = "Any client chosen id, unique in the request scope, that " +
            "should be used to co-relate the request and response.",
            example = "policy-request-1")
    private final String id;

    /**
     * The policy to be applied, it's type and any other required attributes. <p>
     * <b>Required.</b>
     */
    @JsonProperty(required = true)
    @ApiModelProperty(example = "{\"type\":\"shipTogether\"}")
    private final Policy policy;

    /**
     * A list of target listing requests, identified by their IDs. <p>
     * <b>Required.</b>
     */
    @JsonProperty(required = true)
    @ApiModelProperty(value = "Listing request ids this policy should be applied to",
            example = "[listing-request-1, listing-request-2]")
    private final List<String> targetListingRequests;

}
