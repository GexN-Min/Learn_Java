package com.itheima.home.day03;

//6、【编号：302】 需求：一年有12个月，分属于春夏秋冬4个季节，
// 键盘录入一个月份，请用程序实现判断该月份属于哪个季节，
// 并输出。
// 春：3、4、5
//  夏：6、7、8
//    秋：9、10、11
//      冬：1、2、12


import java.util.Scanner;

public class Demo06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
        }
    }
}
