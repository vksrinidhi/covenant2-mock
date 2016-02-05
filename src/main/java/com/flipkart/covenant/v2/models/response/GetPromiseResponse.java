package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Collection;

/**
 * Response to a {@code GetPromiseRequest}.
 *
 * @see com.flipkart.covenant.v2.resources.PromiseResource#getPromiseOptions(com.flipkart.covenant.v2.models.request.GetPromiseRequest)
 */
@Data
public class GetPromiseResponse {

    /**
     * One response for each {@code ListingRequest}.
     */
    @JsonProperty
    @ApiModelProperty("One response for each listing request")
    private final Collection<ListingResponse> listings;

    /**
     * One response for each {@code PolicyRequest}.
     */
    @JsonProperty
    @ApiModelProperty("One response for each policy request")
    private final Collection<PolicyResponse> policies;

}
