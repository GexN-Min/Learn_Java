package com.itheima.home.day08字符串;

// 8、
// 【编号：808】 请定义一个方法用于判断一个字符串是否是对称的字符串，
// 并在主方法中测试方法。
// 例如："abcba"、"上海自来水来自海上"均为对称字符串。

import java.util.Scanner;

public class Demo08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String input = sc.nextLine();

        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - i - 1]) {
                if (i >= arr.length - i - 1) {
                    System.out.println("是对称的");
                    break;
                }
                continue;
            } else {
                System.out.println("不是对称的");
                break;
            }
        }
    }
}
