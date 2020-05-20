package com.itratel.drools.droolssample.service;

import com.itratel.drools.droolssample.pojo.People;
import com.itratel.drools.droolssample.pojo.Student;
import com.itratel.drools.droolssample.pojo.StudentRes;
import lombok.Setter;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author whd.java@gmail.com
 * @date 2020/05/20 23:03
 * @apiNote Describe the function of this class in one sentence
 */
@Service
@Setter(onMethod__ = @Autowired )
public class StudentServiceImpl implements IStudentService {

    private KieSession kieSession;

    @Override
    public List<Student> getScoreStudent() {
        List<Student> studentList = getStudents();
        studentList.forEach(System.out::println);
        for (Student student : studentList) {
            kieSession.insert(student);
            kieSession.fireAllRules();
        }
        return Optional.of(studentList).orElse(Collections.emptyList());
    }


    @Override
    public List<StudentRes> getScoreStudentRes() {
        List<People> peopleList = getPeople();
        peopleList.add(new People().setName("name").setDeptCode("dsad").setChinese(0.9630).setMath(0.9265).setEnglish(0.9562));
        peopleList.forEach(System.out::println);
        List<StudentRes> studentResList = new ArrayList<>();
        kieSession.insert(studentResList);
        for (People people : peopleList) {
            kieSession.insert(people);
            kieSession.fireAllRules();
        }
        return Optional.of(studentResList).orElse(Collections.emptyList());
    }
}
