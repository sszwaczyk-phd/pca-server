package pl.sszwaczyk.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sszwaczyk on 10.07.17.
 */
@RestController
@RequestMapping(ApiController.API_PATH)
public class ApiController {

    public static final String API_PATH = "/api/v1";

    public static final String AUTHENTICATE_URL = API_PATH + "/authenticate";

}
