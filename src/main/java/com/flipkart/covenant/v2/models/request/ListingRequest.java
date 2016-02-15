package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Collection;

/**
 * Describes a promise request for a listing.
 * <p>
 * A promise request is composed of availability and serviceability requests.
 * @see com.flipkart.covenant.v2.models.request.AvailabilityRequest
 * @see com.flipkart.covenant.v2.models.request.ServiceRequest
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListingRequest {

    /**
     * Any client chosen id, unique in the request scope, that should be used
     * to co-relate the {@code ListingRequest} and {@code ListingResponse}. <p>
     * <b>Required.</b>
     */
    @ApiModelProperty(value = "Any client chosen id, unique in the request scope, that " +
            "should be used to corelate the request and response",
            example = "listing-request-1")
    @JsonProperty(required = true)
    private final String id;

    /**
     * The listing Id. <p>
     * <b>Required.</b>
     */
    @JsonProperty(required = true)
    @ApiModelProperty(example = "LSTMOBE6KK93JG5WKB27FPDX7")
    private final String listingId;

    /**
     * The INR price per unit of the listing. <p>
     * <b>Optional.</b> Defaults to the {@code Zulu} price
     */
    @JsonProperty
    @ApiModelProperty(value = "Selling price of the listing",
            example = "10999")
    private Integer price;

    /**
     * The number of units of the listing to promise for. Must be greater than 0.<p>
     * <b>Optional.</b> Defaults to 1
     */
    @JsonProperty
    @ApiModelProperty(value = "Number of units of the listing",
            allowableValues = "range[1, infinity]", example = "1")
    private int quantity = 1;

    /**
     * The availability request for this listing. <p>
     * <b>Optional.</b> Defaults to a request to check for inventory.
     */
    @JsonProperty
    @ApiModelProperty("The availability request for this listing.")
    private AvailabilityRequest availabilityRequest = new AvailabilityRequest();

    /**
     * The service requests for this listing. <p>
     * This is an ordered list of services for which promise options are requested for.
     * <b>Optional.</b> Defaults to a single service request of type {@code ForwardServiceRequest}.
     */
    @JsonProperty
    @ApiModelProperty("The services for which promise is requested")
    private MultiServiceRequest serviceRequest = MultiServiceRequest.getDefault();

    /**
     * An exclusive collection of sources to be considered for availability and
     * serviceability for this request. <p>
     * <b>Optional.</b> Defaults to ALL sources.
     */
    @JsonProperty
    @ApiModelProperty(value = "If specified, inventory is only considered from these sources")
    private Collection<String> sources;

}
