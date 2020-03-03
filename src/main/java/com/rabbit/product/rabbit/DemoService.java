package com.rabbit.product.rabbit;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {

    @Retryable(value = RestClientException.class, maxAttempts = 3,
            backoff = @Backoff(delay = 1000L,multiplier = 1))
    public String demo()throws RestClientException{
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.baidu.com";
        //String resp = restTemplate.getForObject(url, String.class);
        System.out.println("demo1开始");
        //int i  = 1/0;
        throw new RestClientException("demo1yichuang1");
        //return "demo1";
    }



    @Recover
    public String recover(Exception e) throws Exception {
        System.out.println("异常1"+e);
        //throw new Exception(e);
        return "haha1";
    }

    /*@Recover
    public String recover(demo2Exception e) {
        System.out.println("异常2"+e.getMessage());
        return "hha2";
    }*/
}

class demo1Exception extends RestClientException{

    public demo1Exception(String msg) {
        super(msg);
    }

    public demo1Exception(String msg, Throwable ex) {
        super(msg, ex);
    }
}

class demo2Exception extends RestClientException{

    public demo2Exception(String msg) {
        super(msg);
    }

    public demo2Exception(String msg, Throwable ex) {
        super(msg, ex);
    }
}