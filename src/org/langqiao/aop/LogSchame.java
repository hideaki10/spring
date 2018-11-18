package org.langqiao.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

public class LogSchame {

    public void afterReturning(JoinPoint jp,Object returnValue) throws Throwable {
        System.out.println("----------------------------+++++++++++++" );
    }

    public void before(JoinPoint jp) {
        System.out.println("************************WWWWWWWWWWWWW");
    }

    public void whenException(JoinPoint jp,NullPointerException e){
        System.out.println("-----------"+e.getMessage());
    }

    public Object around(ProceedingJoinPoint jp) {
        Object result = null;

        System.out.println("+++++++++++++;qianzhidad aodsdsadsででででででええ");
        try {
            result = jp.proceed();
            System.out.println("+++++++++++++;qianzhidad aodsdsadsあっっっっっっっっっd");
        }
        catch (Throwable e) {
            System.out.println("+++++++++++++;error +++++++++++++++++++++++++++++++++");

        }
        return  result;
    }
}

