package com.itheima.home.day07;

// 1、
// 【编号：701】 定义标准学生类，属性包括姓名和年龄，
// 要求分别使用空参和有参构造方法创建对象，空参创建的对象通过setXxx赋值，
// 有参创建的对象直接赋值，并通过show方法展示数据。

public class Students {
    private String name;
    private int age;

    public Students() {

    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(this.name + " " + this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
