package com.flipkart.covenant.v2.models.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Describes the request for the {@code getPromiseOptions(GetPromiseRequest)} method.
 *
 * @see com.flipkart.covenant.v2.resources.PromiseResource#getPromiseOptions(GetPromiseRequest)
 */
@Data
public class GetPromiseRequest {

    /**
     * A collection of {@code ListingRequest} <p>
     * Required. Not null, not empty
     */
    @JsonProperty(required = true)
    @ApiModelProperty("A set of listing requests for which promise options are to be computed")
    private final Collection<ListingRequest> listings;

    /**
     * A collection of {@code PolicyRequest} <p>
     * Optional. Defaults to no policy request
     */
    @JsonProperty
    @ApiModelProperty("A set of policies which should be applied")
    private Collection<PolicyRequest> policies = new ArrayList();

    /**
     * The context in which this request should be processed <p>
     * Optional. Defaults to a regular customer on the website
     */
    @JsonProperty
    @ApiModelProperty("The context in which this request should be processed")
    private PromiseContext context = new PromiseContext(SalesChannel.WEBSITE, CustomerSubscription.REGULAR);

    /**
     * The location of the customer. <p>
     * If no location is specified, promise options will be inaccurate. <p>
     * Optional. Defaults to null.
     */
    @JsonProperty
    @ApiModelProperty("Location of the customer")
    private Location location;
}


