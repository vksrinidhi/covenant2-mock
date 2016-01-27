package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

import java.util.*;

/**
 * Created by saurabh.agrawal on 20/01/16.
 */
public class GetPromiseResponse {

    @JsonProperty
    Set<ListingResponse> listings;

}
