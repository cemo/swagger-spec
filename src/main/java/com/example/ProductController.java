package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import reactor.core.publisher.Mono;

@Validated
@Controller("api/products")
public class ProductController {

  @Get()
  public Mono<ProdcatProductsResponse> getProducts() {
    return null;
  }

}