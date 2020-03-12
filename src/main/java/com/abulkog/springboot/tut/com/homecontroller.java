package com.abulkog.springboot.tut.com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {
    @RequestMapping("/")
    public  String greeting (){
        return "Hello mother fucker";
    }
}
