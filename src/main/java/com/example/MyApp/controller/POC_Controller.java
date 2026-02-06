package com.example.MyApp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
public class POC_Controller {

    @PostMapping("/fingerprint")
    public void receiveFingerprint(@RequestBody Map<String, Object> body) {
        System.out.println("Received browser signatures");
        System.out.println(body);
    }


}
