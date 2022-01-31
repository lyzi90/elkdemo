package com.lzhi.elkdemo.application.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @GetMapping("/login")
    public String login(@RequestParam("user") String user,
                        @RequestParam("pwd") String pwd){
        return user + "login succeed.";
    }
}
