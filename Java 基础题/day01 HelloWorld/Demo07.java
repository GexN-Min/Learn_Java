public class Demo07 {
    public static void main(String[] args) {
      
// 7、【编号：107】 练习基本数据类型之间的相互转换。 
// 定义int类型变量，将其赋值给double类型，查看结果。 
// 定义byte类型变量，将其赋值给short类型，查看结果。 
// 定义byte类型变量，将其赋值给int类型，查看结果。 
// 定义double类型变量，将其赋值给int类型，查看结果。
         int a = 10;
        double b = 8.0D;
        byte c = 3;
        short d = 7;
        b = a;   // ok
        d = c;   // ok
        a = c;   // ok
        int e = b;  // error
