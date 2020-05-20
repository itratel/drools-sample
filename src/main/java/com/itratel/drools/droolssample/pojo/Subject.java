package com.itratel.drools.droolssample.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author whd.java@gmail.com
 * @date 2020/05/21 00:20
 * @apiNote Describe the function of this class in one sentence
 */
@Data
@Accessors(chain = true)
public class Subject {

    private Double data;

    private Integer score;
}
