package com.sr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //private UserService userService;
    @RequestMapping("user")
    public String userC(){
        //userService.userS();
        System.out.println("hall");
        System.out.println("1");
        return "hallWord";
    }
}
