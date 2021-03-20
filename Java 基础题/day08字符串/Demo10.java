package com.itheima.home.day08字符串;

// 10、【编号：810】 在登录注册页面中，除了用户名和密码外，
// 通常也会包含验证码。验证码是用来区分用户是计算机还是人，
// 防止恶意破解密码、刷票、灌水等行为。
// 请查看Random、StringBuilder相关API，定义方法，
// 获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，
// 可包含a-z,A-Z,0-9。例如：
//7Kt5

import java.util.ArrayList;
import java.util.Random;

public class Demo10 {

    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<Character>();
        StringBuilder sb = new StringBuilder();
        Random r = new Random();

        for (char i = 'A'; i <= 'Z'; i++) {
            arr.add(i);
        }

        for (char i = 'a'; i <= 'z'; i++) {
            arr.add(i);
        }

        for (char i = '0'; i <= '9'; i++) {
            arr.add(i);
        }

        for (int i = 1; i <= 4; i++) {
            sb.append(arr.get(r.nextInt(arr.size())));
        }

        System.out.println(sb.toString());
    }
}
