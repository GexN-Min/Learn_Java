// 4、【编号：212】 红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
// 绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
// 那么红茶和绿茶现在的钱一样多，请问对么？
// 请编写程序进行判断。

public class Demo04 {
    public static void main(String[] args) {

        int honCha = 21;
        int luCha = 24;

        int hMoney = honCha * 2 + 3;
        int lMoney = luCha * 2;

        System.out.println(hMoney);
        System.out.println(lMoney);

        System.out.println(hMoney == lMoney);

    }
}
