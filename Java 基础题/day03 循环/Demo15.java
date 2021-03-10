package com.itheima.home.day03;

//15、
// 【编号：314】 中国使用的公历有闰年的说法。
// 闰年的规则是：四年一闰，百年不闰，四百年再闰。
// （年份能够被4整除但不能被100整除算是闰年，
// 年份能被400整除也是闰年）。
// 请统计出1988年到2019年的闰年年份有多少个。

public class Demo15 {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1988; i <= 2019; i++) {
                if (i % 400 == 0) {
                    sum++;
                } else if (i % 4 == 0 && i % 100 != 0) {
                    sum++;
                }
            }

            System.out.println(sum);
        }
}
