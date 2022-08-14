package com.example.springhibernatefulldemoapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
public class IndexController {

    @RequestMapping({"/", "", "/index"})
    public String index() {
        return "index";
    }
}
