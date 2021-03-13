package com.itheima.home.day05;

//9、
// 【编号：506】 请定义一个方法，实现求一个整数数组中的最大值。
// 调用方法，查看结果。

public class Demo09 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        maxArr(arr);
    }

    private static void maxArr(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
