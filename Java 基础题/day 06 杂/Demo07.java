package com.itheima.home.day06;

// 7、【编号：605】 有这样的一个数组，元素是{68,27,95,88,171,996,51,210}。
// 求出该数组中满足要求的元素和，
// 要求是：求和的元素个位和十位都不能是7，并且只能是偶数。

public class Demo07 {
    public static void main(String[] args) {

        int[] arr = {68,27,95,88,171,996,51,210};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int ge = arr[i] % 10;
            int shi = arr[i] / 10 % 10;

            if (arr[i] % 2 == 0) {
                if (ge != 7 && shi != 7) {
                    sum += arr[i];
                }
            }
        }
        System.out.println("符合要求的数字和为 " + sum);
    }
}
