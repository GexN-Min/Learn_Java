package com.itheima.home.day06;

// 11、
// 【编号：609】 在编程竞赛中，有6个评委为参赛的选手打分，
// 分数为0-100的整数分。选手的最后得分为：
// 去掉一个最高分和一个最低分后 的4个评委平均值
// (不考虑小数部分)。

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int average = 0;

        for (int i = 0; i < arr.length; i++) {

            try {
                System.out.println("请输入第" + i + "个分数：");
                arr[i] = sc.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("您的输入有误，请重新输入！");
                sc.nextLine();
                i--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }

        average = (sum - max - min) / (arr.length - 2);

        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("去最大最小值后平均分：" + average);
    }
}
