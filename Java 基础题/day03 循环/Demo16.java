package com.itheima.home.day03;

//16、
// 【编号：317】 需求：
//        程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
//        当猜错的时候根据不同情况给出相应的提示
//
//        如果猜的数字比真实数字大，提示你猜的数据大了
//        如果猜的数字比真实数字小，提示你猜的数据小了
//        如果猜的数字与真实数字相等，提示恭喜你猜中了

import java.util.Random;
import java.util.Scanner;

public class Demo16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNum = random.nextInt(100) + 1;

        while (true) {
            System.out.println("请输入您猜想滴数字（输入0退出）：");
            int guessNum = input.nextInt();

            if (guessNum == 0) {
                System.out.println("感谢您滴游玩，再见ヾ(￣▽￣)Bye~Bye~");
                break;
            } else if (guessNum == randomNum) {
                System.out.println("恭喜您，猜中了ヾ(•ω•`)o");
                System.out.println("感谢您的使用;)");
                break;
            } else if (guessNum > randomNum) {
                System.out.println("您猜大了，请重猜！");
                continue;
            } else if (guessNum < randomNum) {
                System.out.println("您猜小了，请重猜！");
                continue;
            }
        }
    }
}