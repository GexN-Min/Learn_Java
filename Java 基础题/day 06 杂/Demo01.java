package com.itheima.home.day06;

// 1、
// 【编号：319】 有一个输出语句System.out.print("@")，
// 表示输出一个"@"，并且不换行。
// 使用这个语句，在控制台打印出一个四行五列的长方形，效果如下：
//@@@@@
//@@@@@
//@@@@@
//@@@@@

public class Demo01 {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            System.out.print("@");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
