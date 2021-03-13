package com.itheima.home.day05;

//    6、【编号：513】 请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。
//    四舍五入之后的结果是一个int整数类型并返回。最后对方法进行测试。

public class Demo06 {
    public static void main(String[] args) {
        float a = 5.7f;
        float b = 5.4f;

        System.out.println(myRund(a));
        System.out.println(myRund(b));
     }

    private static int myRund(float a) {

        int temp = (int) a;
        if (a - temp >= 0.5) {
            return temp + 1;
        } else {
            return temp;
        }
    }
}
