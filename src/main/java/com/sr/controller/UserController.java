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
        return maps;
    }
    @RequestMapping("uploadfile")
    public void upload(){
        
    }
}
