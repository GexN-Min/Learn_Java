package com.itheima.home.day03;

//4、【编号：315】 我国最高的山峰是珠穆朗玛峰，高8848米。
// 一张纸的厚度是0.4毫米。请问，在理论情况下，
// 一张纸折叠多少次可以超越珠峰的高度？

public class Demo04 {
    public static void main(String[] args) {
        double a = 0.1D;
        int count = 0;
        final int ZHU_FENG = 8848000;
        while (a <= ZHU_FENG) {
            a *= 2;
            count++;
        }

        System.out.println(count);
    }
}
