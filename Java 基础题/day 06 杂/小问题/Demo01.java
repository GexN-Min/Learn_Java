package com.itheima.basicode.day06;

/*
public class Demo5 {
    public static void main(String[] args) {
        int[] arr= {7,4,8,2,9,3,4,1};

        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        // 打印结果的顺序是  1 4 3 9 2 8 4 7
    }

    public static void reverse(int[] arr){

    }
}
*/


public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {7, 4, 8, 2, 9, 3, 4, 1};

        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // 打印结果的顺序是  1 4 3 9 2 8 4 7
    }

//    public static void reverse(int[] arr) {
//        int j = arr.length;
//        int temp[] = new int[j];
//        for (int i = 0; i < arr.length; i++) {
//            temp[--j] = arr[i];
//        }
//        for (int i = 0; i < temp.length; i++) {
//            arr[i] = temp[i];
//        }
//    }

    public static void reverse(int[] arr) {
        int j = arr.length;
        for (int i = 0; i < j; i++) {
            if (j - i - 1 < i) {
                break;
            }
            arr[i] = arr[i] ^ arr[j - i - 1];
            arr[j - i - 1] = arr[i] ^ arr[j - i - 1];
            arr[i] = arr[i] ^ arr[j - i - 1];
        }
    }


}
