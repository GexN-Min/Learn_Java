// 11、【编号：205】 请编写程序，通过键盘录入获取三个学生的年龄（单位：岁，整数即可），并找出其中的最小年龄。

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        min = min < b ? min : b;
        min = min < c ? min : c;

        System.out.println(min);
    }
}
