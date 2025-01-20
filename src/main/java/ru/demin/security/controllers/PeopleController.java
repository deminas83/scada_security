package ru.demin.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PeopleController {

    @GetMapping("/login")
    public String getLoginPage(){
       return "/login";
    }

    @GetMapping("/registration")
    public String getRegistrationPage(){
        return "/registration";
    }

}
