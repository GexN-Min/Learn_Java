// 12、【编号：206】 练习if语句。 
// 请定义两个int类型变量a和b，分别赋值10和20，判断a和b的值是否相等，如果相等，就在控制台输出：
// a等于b。 请再定义一个int类型的变量c，赋值为10，判断a和c的值是否相等，如果相等，就在控制台输出：
// a等于c。


public class Demo12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        int c = 10;

        if (a == b) {
            System.out.println("a 等于 b");
        }

        if (a == c) {
            System.out.println("a 等于 c");
        }
    }
}
