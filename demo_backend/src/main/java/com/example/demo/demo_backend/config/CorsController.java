package com.example.demo.demo_backend.config;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://virtual-vault.netlify.app", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class CorsController { @RequestMapping(value = "/**", method = RequestMethod.OPTIONS)
public ResponseEntity<?> handleOptions() {
    return ResponseEntity.ok().build();
}
}
