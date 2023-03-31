package com.example.forpi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ForpiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForpiApplication.class, args);
    }

}

@RestController
@RequestMapping
class Test {
    @GetMapping
    public String home(){
        return "home page";
    }
}
