package com.example;

import java.util.Optional;

public interface ProdcatSearchMetadata extends BaseQueryParams {

  public Page getPage();

  public Optional<String> getLocationId();

  interface Page {

    int getTotalPages();

    int getTotalResults();
  }
}
