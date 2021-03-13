//1、
// 【编号：502】 请定义一个方法，
// 该方法可以实现对int类型的数组进行遍历，
// 在控制台打印所有元素。实现方法后，
// 请在主方法中调用方法，查看结果。
// 例如，
// 数组为{11, 22, 33}，打印格式为：[11, 22, 33]

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33};

        traverseArr(arr);
    }

    private static void traverseArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
