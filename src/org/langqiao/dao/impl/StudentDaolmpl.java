package org.langqiao.dao.impl;

import org.langqiao.dao.IStudentDao;
import org.langqiao.entity.Student;
import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDaolmpl implements IStudentDao {

    public  void addStudent(Student student){
        System.out.println("zengjiaxuex");
        System.out.println(student.getStuName());
        System.out.println(student.getStuAge());
        System.out.println(student.getStuNo());
    }
}
