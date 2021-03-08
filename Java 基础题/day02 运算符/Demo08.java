// 8、【编号：216】 某商场购物可以打折，具体规则如下：
// 普通顾客购不满100元不打折，满100元打9折；
// 会员购物不满200元打8折，满200元打7.5折；
// 不同打折规则不累加计算。 请根据此优惠计划进行购物结算，
// 键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）

public class Demo08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int client = sc.nextInt();
        int a = sc.nextInt();
        switch (client) {
            case 0:
                if (a < 100) {
                    a = a;
                } else if (a >= 100) {
                    a = (int) (a * 0.9);
                }
                break;
            case 1:
                if (a < 200) {
                    a = (int) (a * 0.8);
                } else if (a >= 200) {
                    a = (int) (a * 0.75);
                }
                break;
            default:
                System.out.println("输入错误！");
                break;
        }
        System.out.println(a);

    }
}
