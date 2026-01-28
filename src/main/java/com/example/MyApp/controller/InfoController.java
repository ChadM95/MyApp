package com.example.MyApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
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
        m.put("Spring Version", SpringVersion.getVersion());
        m.put("SpringBoot Version", SpringBootVersion.getVersion());

        return m;
    }

}
