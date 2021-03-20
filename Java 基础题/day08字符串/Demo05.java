package com.itheima.home.day08字符串;

// 5、
// 【编号：805】 请编写程序，由键盘录入一个字符串，
// 统计字符串中英文字母和数字分别有多少个。
// 比如：Hello12345World中字母：10个，数字：5个。

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] arr = input.toCharArray();

        int sum = 0;
        int numberSum = 0;


        for (char ch = 'A'; ch <= 'Z'; ch++) {
            for (char a : arr) {
                if (ch == a) {
                    sum++;
                }
            }
        }

        for (char i = 'a'; i <= 'z'; i++) {
            for (char a : arr) {
                if (i == a) {
                    sum++;
                }
            }
        }

        for (char i = '0'; i <= '9'; i++) {
            for (char a : arr) {
                if (i == a) {
                    numberSum++;
                }
            }
        }

        System.out.println("字母字符有多少个 " + sum);
        System.out.println("数字字符有多少个 " + numberSum);
    }
}
