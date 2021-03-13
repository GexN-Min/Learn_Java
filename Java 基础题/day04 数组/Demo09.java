package com.itheima.home.day04;

//9、【编号：403】 请使用动态初始化的方式，定义一个整型数组，
// 数组的长度由键盘录入（长度1-5即可）。
// 然后再使用键盘录入的方式，分别为数组中的元素赋值。
// 遍历数组，查看每个元素。
// 运行效果如下：
//请输入数组的长度（1-5）：
//4
//请输入第1个元素，共4个
//6
//请输入第2个元素，共4个
//66
//请输入第3个元素，共4个
//666
//请输入第4个元素，共4个
//6666
//录入完毕，结果如下：
//6
//66
//666
//6666

import java.util.Scanner;

public class Demo09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.println("请输入数组的长度（1-5）");
            int temp = sc.nextInt();
            if (temp >= 1 && temp <= 5) {
                a = temp;
                break;
            }
        }
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.format("请输入第%d个元素，共%d个\n", i + 1, arr.length);
            arr[i] = sc.nextInt();
        }

        System.out.println("录入完毕，结果如下：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
