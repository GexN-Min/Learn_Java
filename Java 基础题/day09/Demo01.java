// 1、【编号：901】
// 现有如下字符串元素：
// ["aaa", "bbb", "aaa", "aaa", "ccc", "bbb"]，
// 请将所有的元素按顺序存入ArrayList集合中，
// 并遍历集合查看存储结果。

import java.util.ArrayList;

public class Demo01 {

    public static void main(String[] args) {

        ArrayList<String> arrL = new ArrayList<>();

        arrL.add("aaa");
        arrL.add("bbb");
        arrL.add("aaa");
        arrL.add("aaa");
        arrL.add("ccc");
        arrL.add("bbb");

        for (int i = 0; i < arrL.size(); i++) {
            System.out.println(arrL.get(i));
        }
    }
}
