package com.flipkart.covenant.v2.models.response;

/**
 * Created by srinidhi.vk on 22/02/16.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.covenant.v2.models.request.Policy;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Defines the parameters of a policy.
 */
@Data
public class PolicyDefinition {

    /**
     * Id that uniquely identifies a policy. <p>
     */
    @JsonProperty(required = true)
    private String id;
    /**
     * The policy that is applied, it's type and any other attributes. <p>
     */
    @JsonProperty(required = true)
    @ApiModelProperty("The policy to be applied, it's type and any other required attributes.")
    private final Policy policy;

    /**
     * A list of promise reference ids on which policy is applied. <p>
     */
    @JsonProperty(required = true)
    @ApiModelProperty(value = "Promise ids on which the policy is applied")
    private final List<String> promiseIds;
}
