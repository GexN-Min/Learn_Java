// 6、【编号：214】 李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
// 而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。
// 为了更省钱，李雷要不要以旧换新？请在控制台输出。

public class Demo06 {
    public static void main(String[] args) {

        int price = 7988;
        int discount = (int) (7988 * 0.2);

        System.out.println(discount);
        System.out.println(discount > 1500);

    }
}
