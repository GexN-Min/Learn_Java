package com.itheima.home.day05;

//3、
// 【编号：508】 请定义一个方法，
// 实现交换整数数组中两个索引上的元素值。
// 并调用方法，查看运行效果。
// 例如，数组为{11, 22, 33, 44, 55, 66}，
// 交换索引1和索引5位置上的元素，结果为
// {11, 66, 33, 44, 55, 22}

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55, 66};
        int a = 1;
        int b = 5;

        arr = exchengeArr(arr, a , b);

        System.out.println(Arrays.toString(arr));
    }

    private static int[] exchengeArr(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
