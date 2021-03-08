// 13、【编号：208】 北京市免费乘坐公交车的年龄是65岁。
// 请通过键盘录入获取一个乘客的年龄信息，判断其是否达到免费的年龄，
// 如果达到，请输出“您可以免费乘坐公交车”，
// 如果小于65岁，请输出“您不符合免费标准，请买票”。

import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >= 65) {
            System.out.println("您可以免费乘坐公交车”");
        } else if (a <= 65 && a > 12) {
            System.out.println("您不符合免费标准，请买票");
        }
    }
}
