package com.itheima.home.day06;

// 12、【编号：316】 需求：在控制台输出一天的小时和分钟
//    分钟和小时的范围：
//        分钟：0 <= minute < 60
//        小时：0 <= hour < 24

import java.util.Date;

public class Demo12 {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(String.format("%tc", date));
    }
}
