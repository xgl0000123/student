package org.student.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.student.entity.Student;
import org.student.service.StudentService;

@Controller
public class studentController {

    @Reference
    private StudentService studentService;

    @RequestMapping("/select")
    @ResponseBody
    public String selectStuByNo(){
        Student student = studentService.selectByStuNo(1);
        String name = student.getStuName();
        return name;
    }

}
