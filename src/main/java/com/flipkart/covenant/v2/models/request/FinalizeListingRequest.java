package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by srinidhi.vk on 19/02/16.
 */
/**
 * Describes finalize promise request for a listing.
 * <p>
 * A finalize promise request will have a list of services that need to be finalized.
 * @see com.flipkart.covenant.v2.models.request.ServiceRequest
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinalizeListingRequest {

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
     * The service promises to be finalized for this listing. <p>
     * This is an ordered list of services that needs to be finalized.
     * <b>Required.</b>.
     */
    @JsonProperty
    @ApiModelProperty("The services for which promise is requested")
    private FinalizeMultiServiceRequest serviceRequest;
}
