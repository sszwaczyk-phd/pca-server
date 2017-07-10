package pl.sszwaczyk.web.rest;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sszwaczyk on 06.07.17.
 */
@RestController
@RequestMapping("/test")
public class TestResource {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/download")
    public ResponseEntity<Resource> download() throws IOException {
        InputStream is = new ClassPathResource("static/GODLO_WAT_png.png").getInputStream();
        InputStreamResource resource = new InputStreamResource(is);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(resource);
    }
}
