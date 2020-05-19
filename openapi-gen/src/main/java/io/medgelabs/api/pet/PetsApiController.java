package io.medgelabs.api.pet;

import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

@Controller
@RequestMapping("${openapi.petstore.base-path:}")
public class PetsApiController implements PetsApi {

  private final NativeWebRequest request;

  @org.springframework.beans.factory.annotation.Autowired
  public PetsApiController(NativeWebRequest request) {
    this.request = request;
  }

  @Override
  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }
}
