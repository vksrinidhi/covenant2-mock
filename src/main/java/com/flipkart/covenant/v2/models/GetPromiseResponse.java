package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

/**
 * Created by saurabh.agrawal on 20/01/16.
 */
public class GetPromiseResponse {

    @JsonProperty
    Set<ListingResponse> listings;

}
