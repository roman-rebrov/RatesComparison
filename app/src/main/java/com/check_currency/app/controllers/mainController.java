package com.check_currency.app.controllers;

import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

@Controller
public class mainController {

    @GetMapping("/")
    public String greeting( Model model) {
        Date date = new Date();
        String res = date.toString();
        model.addAttribute("name", res);
        return "home";
    }

}
