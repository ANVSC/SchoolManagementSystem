package com.sumendra.schoolmanagement.helloworld;

import com.sumendra.schoolmanagement.controller.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldComtroller {

    @GetMapping("/api/sms/getHelloworld")
    public String getHelloWorld()
    {
        return  "HelloWorld";
    }


    @Autowired
    DemoService demoService;

    @PostMapping("/saveCustomers")
    public void saveCustomers ()
    {
        demoService.saveCustomers();
    }
}
