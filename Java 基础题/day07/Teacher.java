package com.itheima.home.day07;

// 2、
// 【编号：702】 请定义教师类（Teacher），属性包括姓名和工号。
// 要求分别使用空参和有参构造方法创建对象，空参创建的对象通过setXxx赋值，
// 有参创建的对象直接赋值。
// 定义教课（teach）方法，输出“工号为xxx的xxx老师正在讲课”。

public class Teacher {
    private String name;
    private int teachID;

    public Teacher() {

    }

    public Teacher(String name, int teachID) {
        this.name = name;
        this.teachID = teachID;
    }

    public void teach() {
        System.out.printf("工号为%1d的%1s老师正在讲课", teachID, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeachID() {
        return teachID;
    }

    public void setTeachID(int teachID) {
        this.teachID = teachID;
    }
}
