package org.langqiao.newinstance;

import org.langqiao.dao.IStudentDao;
import org.langqiao.dao.impl.StudentDaolmpl;
import org.langqiao.entity.Student;
import org.langqiao.service.IStudentService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class StudentServiceImpl implements IStudentService {
    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    IStudentDao studentDao ;

    @Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    @Override
    public void addStudent(Student student) {
        //studentDao = null;
        studentDao.addStudent(student);
    }

    @Override
    public void deleteStudentByNo(int N) {
        System.out.println("dadwad");
    }
}
