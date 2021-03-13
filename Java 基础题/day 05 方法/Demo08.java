package com.itheima.home.day05;

// 8、【编号：505】 请定义一个方法，
// 实现将指定int数组中的索引为偶数的元素值增加1。
// 假如数组为{1, 2, 3, 4, 5, 6, 7}，那么调用方法后，
// 数组中的元素变为{2, 2, 4, 4, 6, 6, 8}。
// 调用方法，测试结果。

import java.util.Arrays;

public class Demo08 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        addArrEven(arr);

    }

    private static void addArrEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
