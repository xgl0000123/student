package org.student.service;

import org.student.entity.Student;

public interface StudentService {
    Student selectByStuNo(int stuNo);
    int addStu(Student student);
    int update(Student student);
    int delete(Student student);
}
