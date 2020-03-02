package com.sysops.ryanboueri;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }
}
