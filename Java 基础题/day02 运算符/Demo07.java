// 7、【编号：215】 某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
// ​	存期		年利率（%）

// ​	一年		2.25

// ​	两年		2.7

// ​	三年		3.25

// ​	五年		3.6
// 请存入一定金额，存一定年限（四选一），计算到期后得到的本息总额。 
// 提示：​ 存入金额和存入年限均由键盘录入​ 本息计算方式：本金+本金×年利率×年限

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double benJin = scanner.nextInt();
        int year = scanner.nextInt();
        double money = 0d;

        switch (year) {
            case 1:
                money = benJin + benJin * 2.25 * 1;
                break;
            case 2:
                money = benJin + benJin * 2.7 * 2;
                break;
            case 3:
                money = benJin + benJin * 3.25 * 3;
                break;
            case 5:
                money = benJin + benJin * 3.6 * 5;
                break;
        }

        System.out.println(money);
    }
}
