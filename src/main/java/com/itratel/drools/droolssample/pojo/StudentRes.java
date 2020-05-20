package com.itratel.drools.droolssample.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author whd.java@gmail.com
 * @date 2020/05/20 23:30
 * @apiNote Describe the function of this class in one sentence
 */
@Data
@Accessors(chain = true)
public class StudentRes {

    private String deptCode;

    private String name;

    private Subject sub1;

    private Subject sub2;

    private Subject sub3;
}
