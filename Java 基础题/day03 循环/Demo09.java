package com.itheima.home.day03;
//9、【编号：307】 需求：求1-5之间的数据和，
// 并把求和结果在控制台输出。
public class Demo09 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
