// 10、【编号：204】 一座寺庙里住着三个和尚，他们的身高由键盘录入（单位cm，仅录入数值即可），
// 请用程序实现获取这三个和尚的最高身高。

import java.util.Scnaner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        max = max > b ? max : b;
        max = max > c ? max : c;

        System.out.println(max);
    }
}
