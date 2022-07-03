package com.taohua.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {
    @PostMapping("/loginVerification")
    public void login(@RequestBody Map<String,String> paramMap){
        System.out.println("============执行登录========");
    }
}
