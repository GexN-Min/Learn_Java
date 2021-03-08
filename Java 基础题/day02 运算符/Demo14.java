// 14、【编号：207】 需求：任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数。

import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("是偶数");
        } else {
            System.out.println("是奇数");
        }
    }
}
