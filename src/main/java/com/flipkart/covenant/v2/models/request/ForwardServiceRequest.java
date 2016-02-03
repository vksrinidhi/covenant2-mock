package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

/**
 * Created by saurabh.agrawal on 02/02/16.
 */
@JsonTypeName("FORWARD")
@Data
public class ForwardServiceRequest extends ServiceRequest {
}
