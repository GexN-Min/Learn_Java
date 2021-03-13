package com.itheima.home.day04;

//7、【编号：401】 请使用动态初始化的方式，定义一个长度为3的整型数组，然后分别为数组中的元素赋值为11，22，33，遍历数组，查看每个元素。运行结果如下：
//        11
//        22
//        33

public class Demo07 {
    public static void main(String[] args) {
        int arr[] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 11 * (i + 1);
            System.out.println(arr[i]);
        }
    }
}
