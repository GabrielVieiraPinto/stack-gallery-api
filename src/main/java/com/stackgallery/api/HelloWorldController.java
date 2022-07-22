package com.stackgallery.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
   @GetMapping(path = "/")
    public ResponseEntity<String> helloWorld() {
        return  ResponseEntity.ok("Olá Mundo!");
    }

}
