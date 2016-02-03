package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Collection;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
@Data
public class ListingResponse {

    @ApiModelProperty(value = "The id of the corresponding listing request",
            example = "listing-request-1")
    @JsonProperty(required = true)
    private String listingRequestId;

    @ApiModelProperty(value = "The listing availability information")
    @JsonProperty
    private AvailabilityResponse availability;

    @ApiModelProperty(value = "The list of services that can be offered")
    @JsonProperty
    private Collection<ServiceabilityResponse> serviceability;

}
