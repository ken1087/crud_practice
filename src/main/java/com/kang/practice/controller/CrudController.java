package com.kang.practice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.kang.practice.dto.TestDto;
import com.kang.practice.service.CrudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class CrudController {

    @Autowired
    private CrudService crudService;

    @PostMapping("/crud")
    public void insertCrud(@RequestBody TestDto testDto) {
        crudService.insertCrud(testDto);
    }

    @PutMapping("crud/{id}")
    public void putMethodName(@PathVariable Long id, @RequestBody TestDto testDto) {
        
        crudService.updateCrud(testDto);

    }
    

}
