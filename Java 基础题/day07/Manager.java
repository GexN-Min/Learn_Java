package com.itheima.home.day07;

// 5、【编号：705】 定义项目经理类Manager。
// 属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
// 定义程序员类Coder。
// 属性：姓名name，工号id，工资salary。行为：工作work()
// 要求：
// 1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，set和get方法​
// 2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)​
// 3.调用成员方法,打印格式如下:
//工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
//工号为135基本工资为10000的程序员正在努力的写着代码......

public class Manager {
    private String name;
    private int manID;
    private int salary;
    private int bonus;

    public Manager() {

    }

    public Manager(String name, int manID, int salary, int bonus) {
        this.name = name;
        this.manID = manID;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void work() {
        System.out.printf("工号为%1d基本工资为%1d奖金为%1d的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....\n", manID, salary, bonus);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManID() {
        return manID;
    }

    public void setManID(int manID) {
        this.manID = manID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}


// 定义程序员类Coder。
// 属性：姓名name，工号id，工资salary。行为：工作work()
class Coder {
    private String name;
    private int coderID;
    private int salaty;

    public Coder() {

    }

    public Coder(String name, int coderID, int salaty) {
        this.name = name;
        this.coderID = coderID;
        this.salaty = salaty;
    }

    public void work() {
        System.out.printf("工号为%1d基本工资为%1d的程序员正在努力的写着代码......\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoderID() {
        return coderID;
    }

    public void setCoderID(int coderID) {
        this.coderID = coderID;
    }

    public int getSalaty() {
        return salaty;
    }

    public void setSalaty(int salaty) {
        this.salaty = salaty;
    }
}
