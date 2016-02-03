package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Collection;

/**
 * Created by saurabh.agrawal on 20/01/16.
 */
@Data
public class GetPromiseResponse {

    @JsonProperty
    @ApiModelProperty("One response for each listing request")
    private Collection<ListingResponse> listings;

    @JsonProperty
    @ApiModelProperty("One response for each policy request")
    private Collection<PolicyResponse> policies;

}
