package com.flipkart.covenant.v2.models.response;

/**
 * Created by srinidhi.vk on 22/02/16.
 */

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

/**
 * Defines the parameters of a Preorder promise.
 */
@Data
@JsonTypeName("PRE_ORDER")
public class PreorderPlan extends Plan {
}
