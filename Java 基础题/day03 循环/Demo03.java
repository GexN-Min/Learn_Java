package com.itheima.home.day03;

/*
* 3、【编号：303】 某电信客服服务满意度反馈信息如下：
* 1表示非常满意 2表示基本满意 3表示不满意 4表示非常不满意
* 其他数字表示输入有误
* 请编写程序，通过键盘录入满意度数字，输出相应的满意度信息。
* */


import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("非常满意！");
                break;
            case 2:
                System.out.println("基本满意！");
                break;
            case 3:
                System.out.println("不满意！");
                break;
            case 4:
                System.out.println("非常不满意！");
                break;
            default:
                System.out.println("输入有误！");
                break;

        }
    }
}
