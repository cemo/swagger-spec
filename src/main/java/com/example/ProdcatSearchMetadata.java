package com.example;

public class ProdcatSearchMetadata extends BaseQueryParams {

  public Page getPage(){
    return null;
  }

  interface Page {

    int getTotalPages();

    int getTotalResults();
  }
}
