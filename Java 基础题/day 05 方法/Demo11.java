package com.itheima.home.day05;

// 11、【编号：509】 请定义一个方法，
// 实现获取整数数组的一部分元素，
// 存入一个新数组中，并将新数组返回。
// 获取元素的时候，需要指定开始索引和结束索引，
// 其中包含开始索引上的值但不包含结束索引上的值。
// 调用方法测试结果。 例如，
// 数组为{11, 22, 33, 44, 55, 66}，
// 指定开始和结束索引为1和3，那么得到的结果数组是{22, 33}

import java.util.Arrays;

public class Demo11 {
    public static void main(String[] args) {

        int arr[] = {11, 22, 33, 44, 55, 66};

        int a = 1;
        int b = 3;
        int fArr[] = new int[b - a];
        fArr = returnArr(arr, a, b);
        System.out.println(Arrays.toString(fArr));
    }

    private static int[] returnArr(int[] arr, int a, int b) {
        if (b < a) {
            System.out.println("您输入的数据有误！");
        }
        int tArr[] = new int[b - a];

        for (int i = a; i < b; i++) {
            tArr[i - 1] = arr[i];
        }

        return tArr;
    }
}