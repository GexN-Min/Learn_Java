package com.itheima.home.day08字符串;

// 9、
// 【编号：809】 我国的居民身份证号码，
// 由由十七位数字本体码和一位数字校验码组成。
// 请定义方法判断用户输入的身份证号码是否合法，
// 并在主方法中调用方法测试结果。
// 规则为：号码为18位，不能以数字0开头，
// 前17位只可以是数字，最后一位可以是数字或者大写字母X。

import java.util.Scanner;
// 没能自主完成
public class Demo09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        boolean b = matchID(s);
        System.out.println(b);
    }


    private static boolean matchID(String s) {
        if (s == null) {
            return false;
        }

        if (s.length() != 18) {

        }

        if (s.charAt(0) == 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i == s.length() - 1) {

                if (ch < '0' || ch > '9' && ch != 'X') {
                    return false;
                }
            } else {
                if (ch < '0' || ch > '9') {
                    return false;
                }
            }
        }
        return true;
    }
}
