package com.itheima.home.day06;

// 10、【编号：608】 已知一个数组 arr = {19, 28, 37, 46, 50};
// 用程序实现把数组中的元素值反转(在原数组中操作，不能定义第二个数组)，
// 反转后的数组 arr = {50, 46, 37, 28, 19};
// 并在控制台输出反转后的数组元素

import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        for (int i = 0; i < arr.length; i++) {
            if (arr.length - i - 1 < i) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
