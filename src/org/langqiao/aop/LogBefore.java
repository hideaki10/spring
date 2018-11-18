package org.langqiao.aop;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) {
        System.out.println("qianzhitongzhi");
    }
}
