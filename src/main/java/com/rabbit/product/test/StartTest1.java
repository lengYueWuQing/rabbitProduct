package com.rabbit.product.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class StartTest1 {
    @Autowired
    private DateTestCompent dateTestCompent;

    public void start() throws InterruptedException {
        System.out.println("1   "+ dateTestCompent.getTime().getTime());
    }
}