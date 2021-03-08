// 9、【编号：109】 在今天的课程学习中，我们知道了java的8种基本数据类型，随着后续学习，我们还将学习引用数据类型。
// 此时由于练习需要，我们要了解其中一个最常用的引用数据类型-字符串（String），字符串变量的一种定义方式与基本数据类型一致：
// 数据类型 变量名 = 初始化值；
// String str = "中国";
// System.out.println(str);
// 其中String为数据类型，str为变量名（符合标识符规则即可），"中国"是我们学习的字符串常量值。
// 总体即表示：将字符串"abc"，赋值给字符串类型的变量str。
// // 输出结果为：中国
// 请根据以上描述，选用合适的数据类型定义变量用于描述一个学员的信息，并将其输出到屏幕上。输出结果如下：
// ************************
// 我的姓名是：张三
// 我的性别是：男
// 我的年龄是：18
// 我的地址是：xx省xx市
// 我的饭卡余额是：55.55元
// ************************

public class Demo09 {
    public static void main(String[] args) {

        String name = "张三";
        char gender = '男';
        int age = 18;
        String addr = "xx省xx市";
        float money = 55.55f;

        System.out.println("************************");
        System.out.println("我的姓名是：" + name);
        System.out.println("我的性别是：" + gender);
        System.out.println("我的年龄是：" + 18);
        System.out.println("我的地址是：" + addr);
        System.out.println("我的饭卡余额是：" + money + "元");
        System.out.println("************************");
    }
}
