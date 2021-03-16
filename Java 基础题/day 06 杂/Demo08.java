package com.itheima.home.day06;

//8、【编号：606】 设计一个方法，
// 用于比较两个相同数据类型数组的内容是否相同。

import java.util.Arrays;

public class Demo08 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        arrEqual(arr1, arr2);
    }

    private static void arrEqual(int[] arr1, int[] arr2) {
        System.out.printf("两个数组相等吗？%s%n", Arrays.equals(arr1, arr2));
    }
}
