package com.example.track;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {

    @GetMapping("/")
    public String helli(){
        return ("Hello Your Application is Currently Running At Port:8080");
    }
}
