package com.itheima.home.day06;

// 9、【编号：607】 已知一个数组
// arr = {19, 28, 37, 46, 50};
// 键盘录入一个数据。
// 定义一个方法，完成查找该数据在数组中的索引，并在控制台输出找到的索引值。

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {19, 28, 37, 46, 50};
        int data = 0;
        try {
            System.out.println("请输入一个整数：");
            data = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

        for (int i = 0; i < arr.length; i++) {
            if (data == arr[i]) {
                System.out.println("你查找的数据索引为 " + i);
                break;
            }
        }
    }
}
