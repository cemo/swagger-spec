package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;

public interface BaseQueryParams {

  @JsonProperty("location_id")
  Optional<String> getLocationId();

  @JsonProperty("product_id")
  Optional<Integer> getProductId();

}
