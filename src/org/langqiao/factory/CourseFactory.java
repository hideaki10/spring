package org.langqiao.factory;
//
import  org.langqiao.newinstance.JavaCourse;
import  org.langqiao.newinstance.HtmlCourse;
import  org.langqiao.newinstance.ICourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CourseFactory {

  public static ICourse getCourse(String name){
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

      if(name.equals("java")){
          return (ICourse) context.getBean("javacourse");
      }else {
          return (ICourse) context.getBean("htmlcourse");
      }
  }
}
