/*1、【编号：304】 模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。 要求：​键盘录入三个整数，其中前两个整数代表参加运算的数据，第三个整数为要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，运行效果如下:
        请输入第一个整数：
        10
        请输入第二个整数：
        20
        请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法)
        3
        10 * 20 = 200
        */

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数 a = ");
        int a = sc.nextInt();

        System.out.println("请输入整数 b = ");
        int b = sc.nextInt();

        System.out.println("请输入运算法则:\n输入1表示加法\n输入2表示减法\n" +
                "输入3表示乘法\n输入4表示除法\n");
        int c = sc.nextInt();

        switch (c) {
            case 1:
                System.out.format("%d + %d = %d", a, b, (a + b));
                break;
            case 2:
                System.out.format("%d - %d = %d", a, b, (a - b));
                break;
            case 3:
                System.out.format("%d * %d = %d", a, b, (a * b));
                break;
            case 4:
                System.out.format("%d / %d = %d", a, b, (a / b));
                break;
            default:
                System.out.println("输入有误！");
                break;
        }

    }
}
