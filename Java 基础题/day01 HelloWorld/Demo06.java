public class Demo06 {
    public static void main(String[] args) {
// 6、【编号：106】 在主方法中有如下代码片段：
// 片段1
// int a = 10;
// {
//     a = 20;
//     System.out.println(a);
// }

// 片段2
// {
//     int b = 20;
//     System.out.println(b);
// }
// b = 30;
// System.out.println(b);
// 请分析其中会出现错误的代码，描述错误原因，并进行修正。将修正后的代码写入Test05.java文件中，查看运行结果。
        // 片段一无错
        int a = 10;
        {
            a = 20;
            System.out.println(a);
        }

        // 片段二会报错
        {
            int b = 20;
            System.out.println(b);
        }
        // 修正
        int b = 30;
        System.out.println(b);
    }
}
