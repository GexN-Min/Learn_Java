package com.itheima.home.day05;

//10、
// 【编号：507】 请定义一个方法，
// 实现求一个整数数组中的最小值。
// 调用方法，查看结果。

public class Demo10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        minArr(arr);

    }

    private static void minArr(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
