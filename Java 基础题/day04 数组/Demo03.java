package com.itheima.home.day04;

//3、【编号：409】 创建一个长度为6的整数数组。请编写代码，
// 随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，
// 然后计算出数组中所有元素的和并打印。

import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {

        Random r = new Random();

        int[] arr = new int[6];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            sum += arr[i];
        }
    }
}
