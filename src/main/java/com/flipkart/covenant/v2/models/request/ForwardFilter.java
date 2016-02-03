package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.flipkart.covenant.v2.models.Payment;
import com.flipkart.covenant.v2.models.Speed;

/**
 * Created by saurabh.agrawal on 01/02/16.
 */
@JsonTypeName("FORWARD")
public class ForwardFilter extends ServiceFilter {
    @JsonProperty
    Speed speed = null;

    @JsonProperty
    Payment payment = null;
}
