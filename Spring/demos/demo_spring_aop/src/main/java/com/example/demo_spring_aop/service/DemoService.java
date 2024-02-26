package com.example.demo_spring_aop.service;

import com.example.demo_spring_aop.annotation.CustomAnnotation;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public void method() {
        /*System.out.println("----BB-----");
        methodReturnBoolean();
        */
        System.out.println("Method demoService");
        throw new RuntimeException();
    }

    @CustomAnnotation
    public void methodWithAnnotation() {
        System.out.println("Method with annotation");
    }

    public boolean methodReturnBoolean() {
        System.out.println("Method demoService Return Boolean");
        return true;
    }
}
