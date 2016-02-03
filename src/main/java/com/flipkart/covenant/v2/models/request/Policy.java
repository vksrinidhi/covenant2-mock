package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;

/**
 * Created by saurabh.agrawal on 20/01/16.
 */
@ApiModel(discriminator = "type",
        subTypes = ShipTogether.class)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = ShipTogether.class, name = "SHIP_TOGETHER"))
public abstract class Policy {
}
