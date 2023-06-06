package com.example.test13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test13Application {
    @Autowired
    repo repos01;
    public static void main(String[] args) {
        SpringApplication.run(Test13Application.class, args);
    }
    @GetMapping(value ="/")
    public String HelloWorld(){
        ett ett01=new ett();
        ett01.setItemNm("aaa");
        repos01.save(ett01);
        return "Hello World";
    }
}
