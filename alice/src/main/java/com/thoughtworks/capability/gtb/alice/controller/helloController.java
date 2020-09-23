package com.thoughtworks.capability.gtb.alice.controller;

import com.thoughtworks.capability.gtb.alice.utils.HttpGetRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;

@RestController
public class helloController {

    @GetMapping("/hello")
    String hello() throws IOException {
        String url = "http://bob:8081/hello";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url,String.class);
    }
}
