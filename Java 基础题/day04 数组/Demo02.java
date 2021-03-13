package com.itheima.home.day04;

//2、【编号：408】 现有一个小数数组
// {12.9, 53.54, 75.0, 99.1, 3.14}。
// 请编写代码，找出数组中的最小值并打印。

public class Demo02 {
    public static void main(String[] args) {
        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};
        double min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
