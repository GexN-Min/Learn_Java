package com.itheima.home.day04;

//6、【编号：413】 小李用自己的钱买了十只股票，
// 年末他看了各只股票的收益分别是百分之:
// 10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5。
// 请使用数组相关知识编程，
// 帮他统计赚钱的股票和赔钱的股票分别有多少只？
// 打印效果如下：
//        赚钱的股票一共有：4只
//        赔钱的股票一共有：6只

public class Demo06 {
    public static void main(String[] args) {
        double arr[] = {10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5};

        int ZhuanqianSum = 0;
        int PeiqianSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                ZhuanqianSum++;
            } else if (arr[i] < 0) {
                PeiqianSum++;
            }
        }

        System.out.println("赚钱的股票一共有："+ZhuanqianSum + "只");
        System.out.println("赔钱的股票一共有："+PeiqianSum + "只");
    }
}
