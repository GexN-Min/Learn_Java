// 16、【编号：210】 某路公交车实施阶梯票价。
// 公交路线途径40个站点，
// 票价为10（包含）个站以内2元，
// 11~20个站3元，
// 21~30个站4元，
// 31-40个站6元。
// 请编写程序，通过键盘录入乘客乘坐的站数，输出该乘客需要支付的票价。

import java.util.Scanner;

public class Demo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int port = sc.nextInt();
        int price = 0;

        if (port > 31 && port <= 40) {
            price = 6;
        } else if (port > 21 && port <= 30) {
            price = 4;
        } else if (port > 11 && port <= 21) {
            price = 3;
        } else if (port > 0 && port <= 10) {
            price = 2;
        }

        System.out.println(price);
    }
}
