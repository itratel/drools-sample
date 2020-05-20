package com.itratel.drools.droolssample.service;

import cn.hutool.core.util.RandomUtil;
import com.itratel.drools.droolssample.pojo.People;
import com.itratel.drools.droolssample.pojo.Student;
import com.itratel.drools.droolssample.pojo.StudentRes;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author whd.java@gmail.com
 * @date 2020/05/20 22:58
 * @apiNote Describe the function of this class in one sentence
 */
public interface IStudentService {

    /***
     * mock students data
     * @return {@link List<Student>}
     */
    default List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Student student = new Student().setName("student" + i)
                    .setProportion(RandomUtil.randomDouble(0, 1, 4, RoundingMode.HALF_UP));
            Optional.ofNullable(student).ifPresent(list::add);
        }
        return list;
    }

    default List<People> getPeople() {
        List<People> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            People people = new People().setDeptCode(RandomUtil.randomString(5)).setName("people"+i)
                    .setChinese(RandomUtil.randomDouble(0, 1,4, RoundingMode.HALF_UP))
                    .setMath(RandomUtil.randomDouble(0, 1,4, RoundingMode.HALF_UP))
                    .setEnglish(RandomUtil.randomDouble(0, 1,4, RoundingMode.HALF_UP));
            Optional.ofNullable(people).ifPresent(list::add);
        }
        return list;
    }

    /***
     * @return {@link List<Student>}
     */
    List<Student> getScoreStudent();

    /***
     * @return {@link List<StudentRes>}
     */
    List<StudentRes> getScoreStudentRes();


}
