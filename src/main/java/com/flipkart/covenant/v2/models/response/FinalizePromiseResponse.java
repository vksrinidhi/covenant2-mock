package com.flipkart.covenant.v2.models.response;

/**
 * Created by srinidhi.vk on 19/02/16.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Response to a {@code FinalizePromiseRequest}.
 *
 * @see com.flipkart.covenant.v2.resources.PromiseResource#finalizePromiseOption(com.flipkart.covenant.v2.models.request.FinalizePromiseRequest, com.flipkart.covenant.v2.models.request.FinalizeType)
 */
@Data
public class FinalizePromiseResponse {
    /**
     * Response {@code FinalizePromiseRequest}.
     */
    @JsonProperty
    @ApiModelProperty("Single finalized id for the requested resources")
    private String promiseId;

    /**
     * Response status.
     */
    @ApiModelProperty("Status of finalize promise")
    @JsonProperty
    private DetailedResponse<FinalizeStatus> status;
}
