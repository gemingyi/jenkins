package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {


    @GetMapping("/start")
    public String testException() {
        return "start";
    }
}
