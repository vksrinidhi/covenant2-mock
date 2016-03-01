package com.flipkart.covenant.v2.models.response;

/**
 * Created by srinidhi.vk on 25/02/16.
 */

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

/**
 * Defines the parameters of a JIT promise.
 */
@Data
@JsonTypeName("JIT")
public class JitPlan extends Plan {
}
