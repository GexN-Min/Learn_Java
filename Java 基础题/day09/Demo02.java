package com.itheima.home.day09集合;

// 2、
// 【编号：902】 请定义教师（Teacher）类，
// 属性包含姓名和专业名称。
// 将若干教师对象存入ArrayList集合中，
// 并遍历集合打印教师信息，格式如下：
// 姓名：赵老师, 专业：javase
// 姓名：钱老师, 专业：javaee
// 姓名：孙老师, 专业：php
// 姓名：李老师, 专业：python

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Teacher> teschArrL = new ArrayList<>();
        Teacher teach1 = new Teacher("赵老师", "javase");
        Teacher teach2 = new Teacher("钱老师", "javaee");
        Teacher teach3 = new Teacher("孙老师", "php");
        Teacher teach4 = new Teacher("李老师", "python");

        teschArrL.add(teach1);
        teschArrL.add(teach2);
        teschArrL.add(teach3);
        teschArrL.add(teach4);

        for (int i = 0; i < teschArrL.size(); i++) {
            teschArrL.get(i).show();
        }
    }
}
