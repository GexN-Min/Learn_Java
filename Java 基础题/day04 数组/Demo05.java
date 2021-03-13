package com.itheima.home.day04;

//5、
// 【编号：411】 定义一个数组来存储10个学生的成绩，
// 例如：
// {72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。
// 计算并输出学生的平均成绩。

import java.util.Random;

public class Demo05 {
    public static void main(String[] args) {

        Random r = new Random();

        int arr[] = new int[10];

        int sum = 0;
        float average = 0.0f;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        average = sum / arr.length;

        System.out.println();
        System.out.println(average);
    }
}
