package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Describes the availability of a {@code ListingRequest}.
 *
 * @see com.flipkart.covenant.v2.models.request.ListingRequest
 */
@ApiModel
@Data
public class AvailabilityPromise {

    /**
     * Whether the requested quantity of the listing is available.
     */
    @ApiModelProperty(value = "Whether the requested quantity of the listing is available")
    @JsonProperty
    private DetailedResponse<Boolean> isAvailable;

    /**
     * The total inventory count available to promise.
     */
    @ApiModelProperty("The total inventory count available to promise")
    @JsonProperty
    private int maxQuantity;
}
