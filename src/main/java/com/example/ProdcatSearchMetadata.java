package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Optional;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.immutables.value.Value;

public class ProdcatSearchMetadata extends BaseQueryParams {

  @JsonProperty("page")
  public Page getPage(){
    return null;
  }

  @JsonProperty("location_id")
  public Optional<String> getLocationId(){
    return null;
  }

  interface Page {

    @JsonProperty("total_pages")
    int getTotalPages();

    @JsonProperty("total_results")
    int getTotalResults();
  }
}
