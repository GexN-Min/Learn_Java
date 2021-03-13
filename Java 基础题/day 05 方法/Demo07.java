package com.itheima.home.day05;

//7、
// 【编号：503】 请定义一个方法，
// 该方法的功能是对键盘录入的一个整数，
// 可以判断这个数是否是奇数（isOdd），
// 如果是返回true，否则返回false。
// 方法定义完毕，请在主方法中调用方法，并输出结果。

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();

        System.out.println("是奇数吗？");
        System.out.println(isOdd(a));
    }

    private static boolean isOdd(int a) {
        return a % 2 == 0 ? false : true;
    }
}
