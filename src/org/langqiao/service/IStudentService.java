package org.langqiao.service;

import org.langqiao.entity.Student;

public interface IStudentService {
    public void  addStudent(Student student);
    public void  deleteStudentByNo(int N);
}
