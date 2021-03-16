package com.itheima.home.day06;

// 4、【编号：501】 请定义一个方法，该方法的功能是在控制台打印九九乘法表。
// 方法实现完毕，请在主方法中调用方法，查看打印结果。

public class Demo04 {
    public static void main(String[] args) {
        printNineMultiNine();
    }

    private static void printNineMultiNine() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.format("%2d * %1d = %2d  ", j, i, i* j);
            }
            System.out.println();
        }
    }
}
