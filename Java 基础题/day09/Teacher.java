package com.itheima.home.day09集合;

// 定义教师（Teacher）类，
// 属性包含姓名和专业名称

public class Teacher {

    private String name;
    private String major;

    public Teacher() {

    }

    public Teacher(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public void show() {
        System.out.println("姓名：" + name + "，专业：" + major);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
