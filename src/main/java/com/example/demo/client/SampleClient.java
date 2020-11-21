package com.example.demo.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@org.springframework.cloud.openfeign.FeignClient(url="http://localhost:8081/api/person", name="teste-feign")
public interface SampleClient {
    @GetMapping("/get-document")
    Map<String, Object> sampleClient(@RequestParam("document") Long document);
}
