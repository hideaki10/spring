package org.langqiao.entity;

import org.langqiao.factory.CourseFactory;
import org.langqiao.newinstance.ICourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {


    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    private int stuNo;
    private String stuName;
    private int stuAge;



    public void learn(String name){
//        ICourse course = CourseFactory.getCourse(name);
//        course.learn();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       ICourse course = (ICourse)context.getBean(name);

       course.learn();
    }

}
