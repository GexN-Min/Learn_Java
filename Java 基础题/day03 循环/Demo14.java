package com.itheima.home.day03;

//14、
// 【编号：312】 统计"水仙花数"一共有多少个，
// 并在控制台输出个数。 水仙花数：
//是一个三位数，它的每个位上的数字的 3次幂之和等于它本身。

public class Demo14 {
    public static void main(String[] args) {
        int sumGeShu = 0;

        for (int i = 100; i <= 999; i++) {

            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            if ((ge*ge*ge + shi*shi*shi + bai*bai*bai) == i) {
                System.out.print(i + " ");
                sumGeShu++;

            }
        }

        System.out.println("所有水仙花数的个数为：" + sumGeShu);

    }
}
