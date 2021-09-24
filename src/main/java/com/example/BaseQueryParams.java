package com.example;

import java.util.Optional;

public interface BaseQueryParams {

  Optional<String> getLocationId();

  Optional<Integer> getProductId();

}
