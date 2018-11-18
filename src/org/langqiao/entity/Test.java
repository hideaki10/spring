package org.langqiao.entity;


import org.langqiao.entity.Student;
import org.langqiao.factory.CourseFactory;
import org.langqiao.newinstance.ICourse;
import org.langqiao.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void learnCourseWithFacory(){
//        Student student = new Student();
//        student.learn("java");
//        student.learn("html");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
          Student student = (Student)context.getBean("student");
//         System.out.println(student.getStuName());
           student.learn("javacourse");
    }

    public static void collectionDemo(){
           ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AllCollectionType allCollectionType =  (AllCollectionType)context.getBean("collectionDemo");
        System.out.println(allCollectionType);
        //allCollectionType.toString();
    }


    public static void testDI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Course course = (Course)context.getBean("course");
        course.showInfo();
    }



    public static void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService =  (IStudentService)context.getBean("studentService");
        Student student = new Student();
        student.setStuAge(23);
        student.setStuName("dwdw");
        studentService.addStudent(student);
       // studentService.deleteStudentByNo(1);

    }

    public static void main(String[] args){
           // learnCourseWithFacory();
     //       testDI();
        //collectionDemo();
        testAop();
    }


}
