package com.example.ksw07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Ksw07Application {

    public static void main(String[] args) {
        SpringApplication.run(Ksw07Application.class, args);
    }

    @GetMapping
    public String HelloWorld(){
        System.out.println("Hello World");
        return "Hello!!";
    }
}
