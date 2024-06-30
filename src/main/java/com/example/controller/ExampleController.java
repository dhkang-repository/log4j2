package com.example.controller;


import com.example.exception.ResourceNotFoundException;
import com.example.log4j2.async.AsyncTest;
import com.example.log4j2.sync.SyncTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ExampleController {

    private final ObjectMapper objectMapper;

    @PostMapping("/json")
    public Map<String, String> jsonTest(@RequestBody Map<String, String> body) throws Exception {
        log.info("Request Body : {}", objectMapper.writeValueAsString(body));
        log.info("Response Body : {}", objectMapper.writeValueAsString(body));
        return body;
    }

    @GetMapping("/resource/{id}")
    public String getResource(@PathVariable("id") String id) {
        if ("notfound".equals(id)) {
            throw new ResourceNotFoundException("Resource not found with id " + id);
        }
        return "Resource " + id;
    }

    @GetMapping("/log4j2/test")
    public String log4j2Test() {
        SyncTest.sync();
        AsyncTest.async();
        return null;
    }
}
