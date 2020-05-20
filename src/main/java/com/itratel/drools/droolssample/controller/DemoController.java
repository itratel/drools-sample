package com.itratel.drools.droolssample.controller;

import com.itratel.drools.droolssample.pojo.Student;
import com.itratel.drools.droolssample.pojo.StudentRes;
import com.itratel.drools.droolssample.service.IStudentService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author whd.java@gmail.com
 * @date 2020/05/20 22:57
 * @apiNote Describe the function of this class in one sentence
 */
@RestController
@Setter(onMethod__ = @Autowired )
public class DemoController {

    private IStudentService studentService;

    @GetMapping("/list")
    public List<Student> getStudent() {
        return studentService.getScoreStudent();
    }

    @GetMapping("/listRes")
    public List<StudentRes> getScoreStudentRes() {
        return studentService.getScoreStudentRes();
    }

}
