package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Collection;

/**
 * Response corresponding to a {@code ListingRequest}.
 *
 * @see com.flipkart.covenant.v2.models.request.ListingRequest
 */
@Data
public class ListingResponse {

    /**
     * The id of the corresponding {@code ListingRequest}.
     */
    @ApiModelProperty(value = "The id of the corresponding listing request",
            example = "listing-request-1")
    @JsonProperty(required = true)
    private final String listingRequestId;

    /**
     * The listing availability information.
     */
    @ApiModelProperty(value = "The listing availability information")
    @JsonProperty
    private final AvailabilityPromise availability;

    /**
     * The set of serviceability options that can be offered.
     */
    @ApiModelProperty(value = "The set of service options that can be offered")
    @JsonProperty
    private final Collection<MultiServicePromise> serviceabilityOptions;

}
