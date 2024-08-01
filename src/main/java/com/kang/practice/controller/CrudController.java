package com.kang.practice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.kang.practice.dto.TestDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CrudController {

    @GetMapping("/")
    public String test(@RequestBody TestDto test) {
        System.out.println(test.getName());
        System.out.println(test.getAge());
        return new String();
    }
    

}
