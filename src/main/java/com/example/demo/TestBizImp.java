/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.stereotype.Component;

/**
 *
 * @author wangchao
 */
@Component
public class TestBizImp implements TestBiz {

    @Override
    public String getTest(String str) {
        return "Get test str "+str;
    }
    
}
