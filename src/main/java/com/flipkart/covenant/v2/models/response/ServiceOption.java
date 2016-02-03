package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.covenant.v2.models.Payment;
import com.flipkart.covenant.v2.models.Speed;
import lombok.Data;

/**
 * Created by saurabh.agrawal on 22/01/16.
 */
@Data
public class ServiceOption {
    @JsonProperty(required = true)
    Speed speed;

    @JsonProperty(required = true)
    Payment payment;
}
