// 2、【编号：202】 练习赋值运算符。请依次完成如下操作： 
// 1、定义int类型的变量，为其赋值为10，并打印输出。 
// 2、将该变量的值增加10，再次打印输出。
// 3、定义short类型的变量，为其赋值为10，将变量的值增加20，并输出结果。

public class Demo02 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a);

        a += 10;
        System.out.println(a);

        short b = 10;
        b = 10 + 20;
        System.out.println(b);

    }
}
