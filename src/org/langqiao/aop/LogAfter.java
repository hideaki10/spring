package org.langqiao.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfter implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) {
                System.out.println(o1+","+method.getName()+","+objects.length+","+o);
    }


}
