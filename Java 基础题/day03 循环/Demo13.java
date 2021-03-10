package com.itheima.home.day03;

//13、
// 【编号：311】 需求：在控制台输出所有的"水仙花数"。
// 水仙花数：是一个三位数，它的每个位上的数字的 3次幂之和等于它本身。

public class Demo13 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {

            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            if ((ge*ge*ge + shi*shi*shi + bai*bai*bai) == i) {
                System.out.print(i + " ");
            }
        }
    }
}
