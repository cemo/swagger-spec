package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;

public class BaseQueryParams {

  @JsonProperty("location_id")
  public Optional<String> getLocationId(){return null;}

  @JsonProperty("product_id")
  public Optional<Integer> getProductId(){return null;}

}
