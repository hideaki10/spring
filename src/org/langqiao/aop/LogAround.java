package org.langqiao.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAround implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        Object result  = null;

        try {
            //控制目标方法的执行
            // 前置通知

           System.out.println("前置通知");
            result = methodInvocation.proceed();
           System.out.println(methodInvocation.getThis()+","+methodInvocation.getMethod().getName()+","+methodInvocation.getArguments()+","+result);
            // 后置通知
           System.out.println("后置通知");
        }
        catch (Exception e){
            // 异常通知
            System.out.println("异常通知");
        }

        return result;
    }
}
