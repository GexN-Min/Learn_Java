package com.itheima.home.day03;

//11、【编号：309】 需求：求1-100之间的偶数和，
// 并把求和结果在控制台输出

public class Demo11 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
