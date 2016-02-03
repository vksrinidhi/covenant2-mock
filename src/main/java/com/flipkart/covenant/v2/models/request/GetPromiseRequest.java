package com.flipkart.covenant.v2.models.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by saurabh.agrawal on 19/01/16.
 */
@Data
public class GetPromiseRequest {

    @JsonProperty(required = true)
    @ApiModelProperty("A set of listing requests for which promise options are to be computed")
    private final Collection<ListingRequest> listings;

    /*
    * The request will succeed only if all policies can be applied.
    * If any policy cannot be applied, the server should throw a 5xx and include an entity containing
    * an explanation of the error situation, and indicate whether it is a temporary or permanent condition.
    */
    @JsonProperty
    @ApiModelProperty("A set of policies that must be applied for computing promise options")
    private Collection<PolicyRequest> policies = new ArrayList();

    @JsonProperty
    private PromiseContext context = new PromiseContext();

    @JsonProperty
    @ApiModelProperty("Location of the customer")
    private Location location = new Location();
}


