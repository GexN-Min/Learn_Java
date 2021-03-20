package com.itheima.home.day08字符串;

// 4、
// 【编号：804】 键盘录入一个字符串，统计该字符串中大写字母字符，
// 小写字母字符，数字字符出现的次数(不考虑其他字符)
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char arr[] = s.toCharArray();

        int upperSum = 0;
        int lowerSum = 0;
        int numberSum = 0;

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            for (char a: arr) {
                if (a == ch) {
                    upperSum++;
                }
            }
        }

        for (char i = 'a'; i <= 'z'; i++) {
            for (char a : arr) {
                if (i == a) {
                    lowerSum++;
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

        System.out.println("大写字符有多少个 " + upperSum);
        System.out.println("小写字母有多少个 " + lowerSum);
        System.out.println("数字字母有多少个 " + numberSum);
    }
}
