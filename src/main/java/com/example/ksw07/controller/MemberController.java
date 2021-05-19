package com.example.ksw07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    @RequestMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("hello","안녕하세용");
        return "hello";
    }
}
