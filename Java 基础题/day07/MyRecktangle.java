package com.itheima.home.day07;

// 7、【编号：707】 请定义一个描述矩形（MyRectangle）的类，
// 包含宽和高两个属性，
// 提供获取矩形周长（perimeter）和面积（area）的方法。
// 并编写测试类进行测试。

public class MyRecktangle {
    private int high;
    private int width;

    public MyRecktangle() {

    }

    public MyRecktangle(int high, int width) {
        this.high = high;
        this.width = width;
    }

    public int getPerimeter() {
        return high * 2 + width * 2;
    }

    public int getArea() {
        return high * width;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
