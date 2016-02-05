package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;

/**
 * Policy indicating that targeted listings should be picked together from the customer.
 * This is analogous to a ship together for forward service.
 */
@ApiModel(parent = Policy.class)
@JsonTypeName("PICK_TOGETHER")
public class PickTogether extends Policy {
}
