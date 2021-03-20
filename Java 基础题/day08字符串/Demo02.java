package com.itheima.home.day08字符串;

// 2、【编号：802】 已知用户名和密码，请用程序实现模拟用户登录。
// 总共给三次机会，是否登录成功，给出相应的提示。

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        String userName = "Admin";
        String passWord = "password1";

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("请输入用户名：");
            String inputName = sc.nextLine();

            System.out.println("请输入密码：");
            String inputPass = sc.nextLine();

            if (userName.equals(inputName) && passWord.equals(inputPass)) {
                System.out.println("认证通过");
                break;
            } else {
                if (i == 3) {
                    System.out.println("您今日的输入次数已经用尽，请明天再来。");
                    break;
                }
                System.out.printf("输入错误，您还有%1d次机会。\n", (3 - i));
            }
        }

    }
}
// 放一个失败案例，
// public static void main(String[] args) {
//        案例1:
//			程序中 有两个字符串  String username = "admin";   String password = "admin";
//			这两个字符串 作为你已经注册好的用户名和密码。
//          请您键盘录入 两个字符串， 分别作为 的登录的 用户名和密码。
//			去和你已经注册好的的那两个用户名和密码 去比较，   都相同就登录成功。
//			提示你 登录成功，
//			可以玩猜数字小游戏了。
//			如果有不同的 就提示你
//			错误 重新录入，  只有三次错误的机会，  3次都错了 程序就结束了。
//
//        Scanner sc = new Scanner(System.in);
//        String username = "admin";
//        String password = "admin";
//
//        String intputName = null;
//        String intputPass = null;
//
//        int count = 0;
//        lo :do {
//            System.out.println("请输入用户名：");
//            intputName = sc.nextLine();
//            if (username.equals(intputName)) {
//                for (int j = 0; j < 3; j++) {
//                    System.out.println("请输入密码：");
//                    intputPass = sc.nextLine();
//                    if (password.equals(intputPass)) {
//                        System.out.println("登录成功，可以玩猜数字小游戏了");
//                        break lo;
//                    } else {
//                        System.out.println("错误 重新录入，  只有三次错误的机会");
//                        count++;
//                    }
//                }
//            } else {
//                System.out.println("错误 重新录入");
//            }
//
//        } while (count < 3);
//    }

