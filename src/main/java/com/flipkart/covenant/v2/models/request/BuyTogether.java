package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;

/**
 * Policy indicating that targeted listings are being bought together.
 */
@ApiModel(parent = Policy.class)
@JsonTypeName("BUY_TOGETHER")
public class BuyTogether extends Policy {
}
