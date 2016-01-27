package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;

/**
 * Created by saurabh.agrawal on 21/01/16.
 */
@ApiModel(parent = Policy.class)
@JsonTypeName("shipTogether")
public class ShipTogether extends Policy {
}
