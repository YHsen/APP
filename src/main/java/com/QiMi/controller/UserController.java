package com.QiMi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class UserController {

    @GetMapping("/zzz")
    public String zzz(){
        return "hallo world";
    }

}
