package com.ztlo.user.controller;

import com.ztlo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.awt.SunHints;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping(value = "/test")
    public String hellow(){
        return  "hellow";
    }

    @PostMapping(value = "/select")
    public List<Map<String,Object>> selectById (){
        return userService.selectById();
    }
}
