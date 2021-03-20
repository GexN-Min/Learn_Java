package com.itheima.home.day08字符串;

// 7、【编号：807】 定义一个方法，实现字符串反转。
// 键盘录入一个字符串，调用该方法后，在控制台输出结果。
//例如，键盘录入abc，输出结果 cba 请使用StringBuilder类实现。

import java.util.Scanner;

public class Demo07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        char[] arr = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());
    }
}
