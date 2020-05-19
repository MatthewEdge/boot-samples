/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.0).
 * https://openapi-generator.tech Do not edit the class manually.
 */
package io.medgelabs.api.pet;

import io.swagger.annotations.*;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

@Api(value = "pets", description = "the pets API")
public interface PetsApi {

  default Optional<NativeWebRequest> getRequest() {
    return Optional.empty();
  }

  /**
   * POST /pets : Create a pet
   *
   * @return Null response (status code 201) or unexpected error (status code 200)
   */
  @ApiOperation(
      value = "Create a pet",
      nickname = "createPets",
      notes = "",
      tags = {
        "pets",
      })
  @ApiResponses(
      value = {
        @ApiResponse(code = 201, message = "Null response"),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class)
      })
  @RequestMapping(
      value = "/pets",
      produces = {"application/json"},
      method = RequestMethod.POST)
  default ResponseEntity<Void> createPets() {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /pets : List all pets
   *
   * @param limit How many items to return at one time (max 100) (optional)
   * @return A paged array of pets (status code 200) or unexpected error (status code 200)
   */
  @ApiOperation(
      value = "List all pets",
      nickname = "listPets",
      notes = "",
      response = Pet.class,
      responseContainer = "List",
      tags = {
        "pets",
      })
  @ApiResponses(
      value = {
        @ApiResponse(
            code = 200,
            message = "A paged array of pets",
            response = Pet.class,
            responseContainer = "List"),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class)
      })
  @RequestMapping(
      value = "/pets",
      produces = {"application/json"},
      method = RequestMethod.GET)
  default ResponseEntity<List<Pet>> listPets(
      @ApiParam(value = "How many items to return at one time (max 100)")
          @RequestParam(value = "limit", required = false)
          Integer limit) {
    getRequest()
        .ifPresent(
            request -> {
              for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                  String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"tag\" : \"tag\" }";
                  ApiUtil.setExampleResponse(request, "application/json", exampleString);
                  break;
                }
              }
            });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /pets/{petId} : Info for a specific pet
   *
   * @param petId The id of the pet to retrieve (required)
   * @return Expected response to a valid request (status code 200) or unexpected error (status code
   *     200)
   */
  @ApiOperation(
      value = "Info for a specific pet",
      nickname = "showPetById",
      notes = "",
      response = Pet.class,
      tags = {
        "pets",
      })
  @ApiResponses(
      value = {
        @ApiResponse(
            code = 200,
            message = "Expected response to a valid request",
            response = Pet.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class)
      })
  @RequestMapping(
      value = "/pets/{petId}",
      produces = {"application/json"},
      method = RequestMethod.GET)
  default ResponseEntity<Pet> showPetById(
      @ApiParam(value = "The id of the pet to retrieve", required = true) @PathVariable("petId")
          String petId) {
    getRequest()
        .ifPresent(
            request -> {
              for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                  String exampleString = "{ \"name\" : \"name\", \"id\" : 0, \"tag\" : \"tag\" }";
                  ApiUtil.setExampleResponse(request, "application/json", exampleString);
                  break;
                }
              }
            });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
