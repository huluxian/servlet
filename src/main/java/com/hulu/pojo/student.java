package com.hulu.pojo;

/**
 * Description: new java files header..
 *
 * @author hulu
 * @version 1.0
 * @date 2022/6/29 21:20
 */

public class student {

    private Integer sid;
    private String number;
    private Integer sex;
    private String sdept;

    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", number='" + number + '\'' +
                ", sex=" + sex +
                ", sdept='" + sdept + '\'' +
                '}';
    }
}
