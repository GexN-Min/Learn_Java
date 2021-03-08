// 15、【编号：209】 需求：小明快要期末考试了，小明爸爸对他说，会根据他不同的考试成绩，送他不同的礼物，
// 假如你可以控制小明的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台输出。
// 奖励：
// 	95~100		山地自行车一辆
// 	90~94		游乐场玩一次
// 	80~89		变形金刚玩具一个
// 	80以下		胖揍一顿

import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >= 95 && a <= 100) {
            System.out.println("山地自行车一辆");
        } else if (a >= 90 && a < 95) {
            System.out.println("游乐场玩一次");
        } else if (a >= 80 && a < 89) {
            System.out.println("变形金刚玩具一个");
        } else if (a >= 0 && a < 80) {
            System.out.println("胖揍一顿");
        }
    }
}
