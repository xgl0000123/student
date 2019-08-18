package org.student.mapper;

import org.springframework.stereotype.Repository;
import org.student.entity.Student;
//12345
@Repository
public interface StudentMapper {
    Student selectByStuNo(int stuNo);
    int addStu(Student student);
    int update(Student student);
    int delete(Student student);
}
