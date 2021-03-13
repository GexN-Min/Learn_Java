package com.itheima.home.day05;

//4、
// 【编号：512】 在主方法中通过键盘录入三个整数。
// 定义一个方法，方法接收三个整数变量，
// 在方法中从大到小依次打印三个变量。
// 执行效果如下：
//        请输入第一个整数：10
//        请输入第二个整数：30
//        请输入第三个整数：20
//        从大到小的顺序是： 30 20 10

import java.util.Arrays;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        System.out.println("请输入第一个整数：");
        arr[0] = sc.nextInt();
        System.out.println("请输入第二个整数：");
        arr[1] = sc.nextInt();
        System.out.println("请输入第三个整数：");
        arr[2] = sc.nextInt();

        printArr(arr);

    }

    private static void printArr(int[] arr) {
        System.out.print("从大到小的顺序是：");
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
