package com.example;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Status;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.Operation;
import javax.validation.Valid;

/** Controller to manage item data. */
@Validated
@io.micronaut.http.annotation.Controller("/openapi")
public class Controller {

  @Post(consumes = MediaType.APPLICATION_JSON)
  @Operation(summary = "OpenAPI example")
  @Status(HttpStatus.NO_CONTENT)
  public void postRaw(@Valid @Body Dto dto) {
  }
}
