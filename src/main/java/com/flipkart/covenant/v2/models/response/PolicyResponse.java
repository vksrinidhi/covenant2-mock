package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by saurabh.agrawal on 01/02/16.
 */
public class PolicyResponse {
    @ApiModelProperty(value = "The id of the corresponding policy request",
            example = "policy-request-1")
    @JsonProperty(required = true)
    String policyRequestId;

    @ApiModelProperty("Whether the policy is applicable")
    @JsonProperty(required = true)
    DetailedResponse<Boolean> applicable;
}
