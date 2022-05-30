package com.bridgelabz.springdemoapp.controller;
import com.bridgelabz.springdemoapp.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringBootController {

    /**
     * UC1
     * Using Get request method
     * @return Hello Everyone
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Everyone";
    }

    @RequestMapping(value = {"/hello-w"}, method = RequestMethod.GET)
    public String sayHelloDifferently() {
        return "Hello Everyone";
    }

    /**
     * UC2
     *Make REST Call to show Hello
     * - Use GET Request Method and pass name as
     * query parameter
     *
     */

    @GetMapping("/hello/query")
    public String sayPosting(@RequestParam String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

    @GetMapping("/hello/{firstName}")
    public String sayHello(@PathVariable String firstName) {
        return "Hello " + firstName;
    }

    @PostMapping("/hello/post")
    public String sayPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }
}