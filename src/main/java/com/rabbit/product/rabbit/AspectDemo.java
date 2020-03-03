package com.rabbit.product.rabbit;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {
    /*
     * 定义一个切入点
     */
    @Pointcut("execution(public * com.rabbit.product.rabbit.DemoController.sendTest(..))")
    public void PointcutDemo() {
    }

    @AfterReturning(value = "PointcutDemo()", returning = "result")
    public void pointcutDemoAfter(String result){

        System.out.println(result);
    }

    @Around(value = "PointcutDemo()")
    public void pointcutDemoAroud(ProceedingJoinPoint thisJoinPoint){

        Object object = null;
        try {
            object = thisJoinPoint.proceed(thisJoinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println(object);
    }
}
