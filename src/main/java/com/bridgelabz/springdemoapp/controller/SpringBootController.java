package com.bridgelabz.springdemoapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Everyone";
    }

    @RequestMapping(value = {"/hello-w"}, method = RequestMethod.GET)
    public String sayHelloDifferently() {

        return "Hello Everyone";
    }

}
