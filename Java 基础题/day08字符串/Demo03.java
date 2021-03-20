package com.itheima.home.day08字符串;

// 3、【编号：803】 键盘录入一个字符串，
// 使用程序实现在控制台遍历该字符串。

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

    }
}
