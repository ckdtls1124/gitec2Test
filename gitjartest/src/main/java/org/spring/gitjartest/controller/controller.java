package org.spring.gitjartest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/test")
    public String test(){

        return "github ec2 jar test";
    }
}
