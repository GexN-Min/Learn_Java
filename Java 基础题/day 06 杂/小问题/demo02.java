package com.itheima.basicode.day06;

// 二维数组的求和：
//				案例1:只求总和
//				案例2：二维数组的求总和打印出来，
//				每个一维数组的和 打印出来。
//
//			二维数组求最值：
//				案例1：只求总最值
//				案例2: 不仅把整个二维数组中的总最值打印出来，
//				并且 把每个一维数组里面的最值也打印出来
//				案例3：不仅把整个二维数组中的总最值打印出来，
//				并且 把每个一维数组里面的最值也打印出来，
//				并且 告诉用户，你这个二维数组的总最值，是哪个一维数组的啊？


public class demo02 {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 45, 67, 89},
                {1, 2, 3, 4 ,99, -36},
                {4, 5, 56, 78}
        };

        int totalSum = 0;
        int[] arrSum = new int[arr.length];

        // 总和
        // 1
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                totalSum += arr[i][j];
            }
        }
        System.out.println("这个二维数组中元素的总和是 " + totalSum);

        System.out.println("============================");

        // 2

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrSum[i] += arr[i][j];
            }
        }
        for (int i = 0; i < arrSum.length; i++) {

            System.out.println("二维数组中第 " + i + " 个一维数组的总和是" + arrSum[i]);
        }

        System.out.println("============================");

        // 最值
        // 3
        int totalMax = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (totalMax < arr[i][j]) {
                    totalMax = arr[i][j];
                }
            }
        }

        System.out.println("这个二维数组的总最大值为 " + totalMax);

        System.out.println("============================");

        // 4
        int maxArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (totalMax < arr[i][j]) {
                    totalMax = arr[i][j];
                }
                if (maxArr[i] < arr[i][j]) {
                    maxArr[i] = arr[i][j];
                }
            }
        }

        for (int i = 0; i < maxArr.length; i++) {

            System.out.println("二维数组中第 " + i + " 个一维数组的最大值是 " + maxArr[i]);
        }

        System.out.println("============================");

        // 5
        for (int i = 0; i < maxArr.length; i++) {
            if (maxArr[i] == totalMax) {
                System.out.println("总二维数组最大值 " + totalMax + " 来自第 " + i + " 个一维数组");
            }
        }
    }
}
