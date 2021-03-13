package com.itheima.home.day05;

//5、
// 【编号：511】 数字是有绝对值的，
// 负数的绝对值是它本身取反，
// 非负数的绝对值是它本身。
// 请定义一个方法，
// 方法能够得到小数类型数字的绝对值并返回。
// 请定义方法并测试。

public class Demo05 {
    public static void main(String[] args) {
        float a = 3.4f;
        float b = - 2.4f;

        System.out.println(printAbs(a));
        System.out.println(printAbs(b));
    }

    private static float printAbs(float a) {
        if (a >= 0) {
            return a;
        } else {
            return 0 - a;
        }

    }
}
