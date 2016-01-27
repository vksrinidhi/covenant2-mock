package com.flipkart.covenant.v2.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

/**
 * Created by saurabh.agrawal on 19/01/16.
 */
public class GetPromiseRequest {

    @JsonProperty(required = true)
    Set<ListingRequest> listings;

    /*
    * The request will succeed only if all policies can be applied.
    * If any policy cannot be applied, the server should throw a 5xx and include an entity containing
    * an explanation of the error situation, and indicate whether it is a temporary or permanent condition.
    */
    @JsonProperty
    Set<PolicyRequest> policies;

    @JsonProperty
    PromiseContext context;

}


