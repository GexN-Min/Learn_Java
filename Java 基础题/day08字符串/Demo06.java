package com.itheima.home.day08字符串;

// 6、
// 【编号：806】 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
// 并在控制台输出结果。
// 要求：​
// 1、如果传递的参数为空，返回null​
// 2、如果传递的数组元素个数为0，返回[]​
// 3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]

public class Demo06 {

    public static void main(String[] args) {
        int[] arr = {3, 6, 8};

        int[] arr03 = {3, 6, 8, 6, 5, 5, 5, 7462, 34};


        String string = myGetString(arr);
        System.out.println(string);
        String string1 = myGetString(arr03);
        System.out.println(string1);

    }

    private static String myGetString(int[] arr) {
        StringBuilder s = new StringBuilder();
        s.append('[');
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s.append(arr[i] + "]");
                break;
            }
            s.append(arr[i] + ", ");
        }
        return s.toString();
    }
}
