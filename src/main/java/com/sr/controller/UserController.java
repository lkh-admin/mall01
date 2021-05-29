package com.sr.controller;

import com.sr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("user")
    public List<Map> userC(){
        List<Map> maps = userService.userS();
        System.out.println("hall");
        System.out.println("1");
        System.out.println("222");
        System.out.println("3333");
        return maps;
    }
}
