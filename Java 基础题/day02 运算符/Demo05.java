// 5、【编号：213】 某小伙想定一份外卖，商家的优惠方式如下：
// 鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
// 订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。
// 那么这个小伙要点这三样东西，最少要花多少钱？
// 请编写程序计算。

public class Demo05 {
    public static void main(String[] args) {

        int yuRu = 24;
        int yuRuYouHui = 16;
        int huaSheng = 8;
        int miFan = 3;

        System.out.println((yuRu + huaSheng + miFan) * 0.8);  // 28.0
        System.out.println(yuRuYouHui + huaSheng + miFan);    // 27
    }
}
