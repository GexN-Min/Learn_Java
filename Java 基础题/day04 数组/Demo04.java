package com.itheima.home.day04;

//4、【编号：410】 现有一个整数数组，长度为5.
// 数组中的每个元素都是[0-9]之间的数字，
// 从数组的最大索引位置开始到最小索引位置，
// 依次表示整数的个位、十位、百位。。。依次类推。
// 请编写程序计算，这个数组所表示的整数值。例如：
//        数组：{2, 1, 3, 5, 4}
//        表示的整数为：21354
// 注意：是整数类型的两万一千三百五十四，不是字符串拼起来的。

import java.util.Random;

public class Demo04 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Random r = new Random();

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
            System.out.print(arr[i] + " ");
        }


        int j = 10;
        int a = 100000;

        for (int i = 0; i < arr.length; i++) {

            int temp = arr[i] * a / j;
            num += temp;
            a = a / j;
        }

        System.out.println(num);

    }
}

// 个 arr[4] 1
// 十 arr[3] 10
// 百 arr[2] 100
// 千 arr[1] 1000
// 万 arr[0] 10000