/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wangchao
 */
@Controller
public class TestController2 {
    
    @Autowired
    private TestBiz testBiz;
    
    @GetMapping("/test2")
    public ResponseEntity hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Foo-bar", "hahaha");
        return new ResponseEntity<>(String.format("Hello %s!", testBiz.getTest(name)),headers, HttpStatus.OK);
    }
}
