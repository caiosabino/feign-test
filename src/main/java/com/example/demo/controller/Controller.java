package com.example.demo.controller;

import com.example.demo.client.SampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {
    @Autowired
    private SampleClient client;

    @GetMapping("/feign/{document}")
    public  Map<String, Object> testeFeign(@PathVariable(value="document") Long document){
        return client.sampleClient(document);
    }
}
