package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Set;

/**
 * Created by saurabh.agrawal on 20/01/16.
 */
public class GetPromiseResponse {

    @JsonProperty
    @ApiModelProperty("One response for each request")
    Set<ListingResponse> listings;

}
