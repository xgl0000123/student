package org.student.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.student.entity.Student;
import org.student.mapper.StudentMapper;
import org.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student selectByStuNo(int stuNo) {
        return studentMapper.selectByStuNo(stuNo);
    }

    @Override
    public int addStu(Student student) {
        return 0;
    }

    @Override
    public int update(Student student) {
        return 0;
    }

    @Override
    public int delete(Student student) {
        return 0;
    }
}
