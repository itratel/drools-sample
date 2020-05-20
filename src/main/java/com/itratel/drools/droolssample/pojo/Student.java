package com.itratel.drools.droolssample.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author whd.java@gmail.com
 * @date 2020/05/20 22:46
 * @apiNote Describe the function of this class in one sentence
 */
@Data
@Accessors(chain = true)
public class Student {

    private String name;

    private String rank;

    private Double proportion;

    private Double score;
}
