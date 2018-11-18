package org.langqiao.aop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
import java.rmi.RemoteException;


public class LogException implements ThrowsAdvice {

    public void afterThrowing(Method method, Object[] args, Object target, Throwable ex){
        System.out.println(target+","+method.getName()+","+args.length+","+ex);
    }
}
