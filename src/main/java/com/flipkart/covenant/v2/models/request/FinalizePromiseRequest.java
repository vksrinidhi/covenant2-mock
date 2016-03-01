package com.flipkart.covenant.v2.models.request;

/**
 * Created by srinidhi.vk on 19/02/16.
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Describes the request for the {@code finalizePromiseOption(FinalizePromiseRequest)} method.
 *
 * @see com.flipkart.covenant.v2.resources.PromiseResource#finalizePromiseOption(FinalizePromiseRequest, FinalizeType)
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinalizePromiseRequest {

    /**
     * A collection of {@code FinalizeListingRequest} <p>
     * Required. Not null, not empty
     */
    @JsonProperty(required = true)
    @ApiModelProperty("A set of listing requests for which promise options are to be reserved")
    private Collection<FinalizeListingRequest> listings;

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

    /**
     * TTL of the promise. <p>
     * Optional. Defaults to 1s.
     */
    //TODO:: Who can update the TTL when an order is on hold? Configure the right maximum
    @JsonProperty(required = true)
    @ApiModelProperty("TTL of a promise in seconds")
    @Min(1)
    @Max(10000L)
    private long ttl;


}
