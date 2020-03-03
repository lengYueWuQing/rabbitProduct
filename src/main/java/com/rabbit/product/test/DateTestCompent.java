package com.rabbit.product.test;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DateTestCompent {

    private Date time;

    public void setTime(Date da){
        System.out.println("传入时间"+ da.getTime());
        time = da;

    }

    public Date getTime(){
        return time;

    }

}
