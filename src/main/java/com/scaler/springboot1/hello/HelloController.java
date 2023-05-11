package com.scaler.springboot1.hello;


//import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/you")
    public String helloYou(@RequestParam("name") String name){
        return "Hello " + name;
    }

}