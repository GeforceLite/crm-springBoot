package com.cc.crm.settings.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultStart {
    @PostMapping("/")
    public String defaultStart(){
        return "static/login.jsp";
    }
}
