package com.letsdoit.onewayssldemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/https/v1/test")
public class HttpsController {

    @GetMapping
    @ResponseBody
    public String sayHello() {
        return "Hi, This is https demo test !";
    }
}
