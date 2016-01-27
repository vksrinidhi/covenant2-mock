package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by saurabh.agrawal on 22/01/16.
 */
public class ServiceOption {
    @JsonProperty
    Speed speed;

    @JsonProperty
    Payment payment;
}
