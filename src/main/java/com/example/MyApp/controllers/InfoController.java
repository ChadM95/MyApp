package com.example.MyApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class InfoController {

    @Autowired
    private Environment env;

    @GetMapping("/info")
    public Map<String, Object> getInfo() {

        Map<String, Object> m = new LinkedHashMap<>();
        m.put("App Name", env.getProperty("spring.application.name"));
        m.put("Java Version", System.getProperty("java.version"));
        m.put("Spring Version", System.getProperty("spring.version"));
        m.put("SpringBoot Version", System.getProperty("spring.boot.version"));

        return m;
    }

}
