package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;

public interface ProdcatProductsResponse {

  @JsonProperty("search_meta")
  Optional<ProdcatSearchMetadata> getSearchMetadata();


}
