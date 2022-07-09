package com.taohua.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    public static final Logger log = LoggerFactory.getLogger(LoginController.class);
    @PostMapping("/loginVerification")
    public void login(@RequestBody Map<String,String> paramMap){
        log.info("========执行登录方法info===========");
        log.warn("=======执行登录方法warn");
        log.error("====执行登录方法error=====");
        log.debug("====执行登录方法debuger====");
    }
}
