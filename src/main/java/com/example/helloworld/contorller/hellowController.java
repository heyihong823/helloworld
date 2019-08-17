package com.example.helloworld.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class hellowController {
    @RequestMapping("/index")
    public String hello()
    {
        return  "hello,world";
    }
}
