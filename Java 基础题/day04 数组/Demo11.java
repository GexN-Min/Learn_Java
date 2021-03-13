package com.itheima.home.day04;

//11、
// 【编号：406】 现有一个整型数组，数组中的元素为
// [12, 23, 34, 45, 56, 67]。
// 请遍历该数组，输出其中为偶数的元素值。

public class Demo11 {
    public static void main(String[] args) {
        int arr[] = new int[] {12, 23, 34, 45, 56, 67};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
