package com.itheima.home.day03;
//12、
// 【编号：310】 求1-100直接所有是3的倍数的整数的和，
// 并将该结果输出到控制台。
public class Demo12 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
    }
}
