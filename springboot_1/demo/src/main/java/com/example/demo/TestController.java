package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class TestController {
    @RequestMapping("/json")
    public Map<String, String> json() {
        return Collections.singletonMap("message", "Hello JSON!");
    }

}
