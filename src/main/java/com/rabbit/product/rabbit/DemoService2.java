package com.rabbit.product.rabbit;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService2 {



    @Retryable(value = demo2Exception.class, maxAttempts = 3,
            backoff = @Backoff(delay = 1000L,multiplier = 1))
    public String demo2()throws demo2Exception {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.baidu.com";
        //String resp = restTemplate.getForObject(url, String.class);
        System.out.println("demo2开始");
        //int i  = 1/0;
        throw new demo2Exception("demo2yichuang1");
        //return "demo2";
    }

    @Recover
    public String recover(Exception e) throws Exception {
        System.out.println("异常2"+e);
        //throw new Exception(e);
        return "haha12";
    }


}

