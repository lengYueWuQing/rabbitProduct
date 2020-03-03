package com.rabbit.product.interceptor;

import com.rabbit.product.rabbit.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestControllerAdvice
public class RrcRestAdvicException {
    private final Logger LOG = LoggerFactory.getLogger(RrcRestAdvicException.class);

    @ExceptionHandler(Exception.class)
    public Object resolve(Exception e, HttpServletRequest request){
        String path = request.getRequestURI();
        Response res = Response.error("内部错误");
        if(e instanceof HttpMessageNotReadableException){
            res = Response.error("请求格式有误");
            LOG.info(e.getMessage());
        }

        //异常返回
        LOG.error("异常 path:{} ", path, e);
        return res;
    }
}
