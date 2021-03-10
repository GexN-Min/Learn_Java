package com.itheima.home.day03;

//7、【编号：305】 for循环练习。
// 请使用for循环语句，在控制台依次输出1-5的整数。
// 请使用for循环语句，在控制台依次输出5-1的整数。

public class Demo07 {
    public static void main(String[] args) {
        // 1
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // 2
        for (int i = 5; i >= 1 ; i--) {
            System.out.print(i + " ");
        }
    }
}
