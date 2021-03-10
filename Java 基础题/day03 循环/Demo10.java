package com.itheima.home.day03;

//10、【编号：308】 请求出10的阶乘的值，
// 并将该值在控制台输出。
// 阶乘：一个正整数n的阶乘 = 1 * 2 * 3 * ... * n。
public class Demo10 {

    public static void main(String[] args) {
        int i = 1;
        int multi = 1;
        while (i <= 10) {
            multi *= i;
            i++;
        }

        System.out.println(multi);
        // System.out.println(1*2*3*4*5*6*7*8*9*10);
    }
}
