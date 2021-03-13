package com.itheima.home.day04;

// 12、
// 【编号：407】 现有一个整型数组，
// 元素为
// [12, 45, 98, 73, 60]。
// 请获取该数组中的最大值，并输出。

public class Demo12 {

    public static void main(String[] args) {

        int arr[] = {12, 45, 98, 73, 60};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }

        System.out.println(max);
    }
}
