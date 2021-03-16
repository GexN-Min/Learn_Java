package com.itheima.home.day07;

// 4、【编号：704】 定义一个女朋友类。
// 女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。
// 另外定义一个用于展示三个属性值的show()方法。请在测试类中通过有参构造方法创建对象并赋值，
// 然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：
//我女朋友叫凤姐,身高155.0厘米,体重130.0斤
//女朋友帮我洗衣服
//女朋友给我做饭

public class GirlFriend {
    private String name;
    private int high;
    private int weight;

    public GirlFriend() {

    }

    public GirlFriend(String name, int high, int weight) {
        this.name = name;
        this.high = high;
        this.weight = weight;
    }

    public void show() {
        System.out.printf("我女朋友叫%1s,身高%1.1f厘米,体重%1.1f斤", name, high, weight);
    }

    public void wash() {
        System.out.println("女朋友帮我洗衣服");
    }

    public void cook() {
        System.out.println("女朋友给我做饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
