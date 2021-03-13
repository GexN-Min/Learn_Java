package com.itheima.home.day04;

//8、【编号：402】 请使用动态初始化的方式，定义一个长度为3的整型数组，然后使用键盘录入的方式，分别为数组中的元素赋值。遍历数组，查看每个元素。运行结果如下：
//        请输入第1个元素，共3个
//        10
//        请输入第2个元素，共3个
//        20
//        请输入第3个元素，共3个
//        30
//        录入完毕，结果如下：
//        10
//        20
//        30

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.format("请输入第%d个元素，共三个", i + 1);
            arr[i] = sc.nextInt();
        }

        System.out.println("录入完毕，结果如下：");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
