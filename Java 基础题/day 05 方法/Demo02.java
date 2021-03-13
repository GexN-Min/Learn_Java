package com.itheima.home.day05;

//2、
// 【编号：504】 请定义一个方法，
// 该方法可以实现求两个整数之中的较大值，并将较大值返回。
// 请以重载的方式再定义一个方法，
// 实现求三个整数之中的最大值，并将最大值返回。
// 在主方法中分别调用这两个方法，测试结果。

public class Demo02 {

    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = 15;

        int max = numMax(a, b);
        System.out.println(max);

        max = numMax(a, b, c);
        System.out.println(max);
    }

    private static int numMax(int a, int b, int c) {
        int temp = numMax(a, b);
        return temp > c ? temp : c;
    }

    private static int numMax(int a, int b) {
        return a > b ? a : b;
    }
}
