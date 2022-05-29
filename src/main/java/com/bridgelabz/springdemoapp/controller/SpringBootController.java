package com.bridgelabz.springdemoapp.controller;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/hello/query")
    public String sayPosting(@RequestParam String firstName, @RequestParam String lastName) {

        return "Hello " + firstName + " " + lastName;
    }
}
