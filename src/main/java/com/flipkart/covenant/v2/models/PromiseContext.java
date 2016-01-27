package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by saurabh.agrawal on 20/01/16.
 */
public class PromiseContext {
    @JsonProperty
    SalesChannel salesChannel;

    @JsonProperty
    CustomerSubscription subscription;

    @JsonProperty
    Date startTime; // default to Time.now()

}
