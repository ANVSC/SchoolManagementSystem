package com.sumendra.schoolmanagement.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldComtroller {

    @GetMapping("/api/sms/getHelloworld")
    public String getHelloWorld()
    {
        return  "HelloWorld";
    }
}
