package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Optional;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.immutables.value.Value;

public interface ProdcatSearchMetadata extends BaseQueryParams {

  @JsonProperty("page")
  Page getPage();

  @JsonProperty("location_id")
  Optional<String> getLocationId();

  interface Page {

    @JsonProperty("total_pages")
    int getTotalPages();

    @JsonProperty("total_results")
    int getTotalResults();
  }
}
