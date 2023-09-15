package com.valen.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloWorld {

    @GetMapping("hello")
    public String hello() {
        return "Hello World!!!";
    }

}
