package com.itratel.drools.droolssample.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author whd.java@gmail.com
 * @date 2020/05/21 00:02
 * @apiNote Describe the function of this class in one sentence
 */
@Data
@Accessors(chain = true)
public class People {

    private String deptCode;

    private String name;

    private Double chinese;

    private Double math;

    private Double english;
//
//    private Double chemistry;
//
//    private Double physics;
//
//    private Double biology;
//
//    private Double history;
}
