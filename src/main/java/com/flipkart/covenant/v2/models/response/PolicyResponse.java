package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Response corresponding to a {@code PolicyRequest}.
 *
 * @see com.flipkart.covenant.v2.models.request.PolicyRequest
 */
@Data
public class PolicyResponse {
    /**
     * The id of the corresponding {@code PolicyRequest}.
     */
    @ApiModelProperty(value = "The id of the corresponding policy request",
            example = "policy-request-1")
    @JsonProperty(required = true)
    private final String policyRequestId;

    /**
     * Whether the policy is applicable.
     */
    @ApiModelProperty("Whether the policy is applicable")
    @JsonProperty(required = true)
    private final DetailedResponse<Boolean> applicable;
}
