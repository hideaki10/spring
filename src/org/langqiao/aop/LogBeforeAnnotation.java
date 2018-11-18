package org.langqiao.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("logAnnotation")
@Aspect
public class LogBeforeAnnotation {

    @Before("execution( public void org.langqiao.newinstance.StudentServiceImpl.addStudent(..))") //定义切点
    public void myBefore(JoinPoint jp){
        System.out.println("前置の通知");
        System.out.println(jp.getTarget()+","+jp.getSignature().getName()+","+ jp.getArgs()+",");
    }

    @AfterReturning("execution( public void org.langqiao.newinstance.StudentServiceImpl.addStudent(..))")
    public void myAfter(JoinPoint jpa){
        System.out.println("五智の通知");
        System.out.println(jpa.getTarget()+","+jpa.getSignature().getName()+","+ Arrays.toString(jpa.getArgs())+",");
    }

    //特定的异常
    @AfterThrowing( pointcut = "execution(public void org.langqiao.newinstance.StudentServiceImpl.addStudent(..))",throwing="exp")
    public void myException(JoinPoint jp,NullPointerException exp){
        System.out.println(exp);
        System.out.println("~~~~~~~~~~~~~異常の通知~~~~~~~~~~~~~~~~~~~~");
    }

//    @Around("execution( public void org.langqiao.newinstance.StudentServiceImpl.addStudent(..))")
//    public void myAround(ProceedingJoinPoint jp){
//
//        try{
//            System.out.println("前置の通知");
//            System.out.println(jp.getTarget()+","+jp.getSignature().getName()+","+ jp.getArgs()+",");
//            jp.proceed();
//            System.out.println("五智の通知");
//            System.out.println(jp.getTarget()+","+jp.getSignature().getName()+","+ Arrays.toString(jp.getArgs())+",");
//        }
//        catch (Throwable e){
//            System.out.println("異常の通知");
//        }
//
//        finally {
//            System.out.println("最終の通知");
//        }
//    }

    @After("execution( public void org.langqiao.newinstance.StudentServiceImpl.addStudent(..))")
    public  void myFinaly(){
        System.out.println("最終の通知");
    }
}
