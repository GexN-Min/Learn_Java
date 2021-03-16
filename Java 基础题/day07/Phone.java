package com.itheima.home.day07;

// 3、【编号：703】 定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，
// 有打电话call()和sendMessage()两个功能。 请定义出手机类，类中要有空参、有参构造方法，
// set/get方法。 定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。 调用对象的两个功能，打印效果如下：
//正在使用价格为3998元黑色的小米手机打电话....
//正在使用价格为3998元黑色的小米手机发短信....

public class Phone {
    private String brand;
    private String color;
    private int price;

    public Phone() {

    }

    public Phone(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void call() {
        System.out.printf("正在使用价格为%1d元%1s的%1s手机打电话....", price, color, brand);
    }

    public void sendMessage() {
        System.out.printf("正在使用价格为%1d元%1s的%1s手机发短信....", price, color, brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
