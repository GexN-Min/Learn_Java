package com.itheima.home.day09集合;

// 3、【编号：903】 有如下员工信息：
//
//  姓名：张三，工资：3000
//  姓名：李四，工资：3500
//  姓名：王五，工资：4000
//  姓名：赵六，工资：4500
//  姓名：田七，工资：5000
//  先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：
//  1、判断是否有姓名为“王五”的员工，如果有，
//    改名为“王小五”
//  2、判断是否有姓名为“赵六”的员工，
//    如果有，将其删除
//  3、给姓名为“田七”的员工，涨500工资

import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<Employee> empleeArrL = new ArrayList<>();

        Employee empl1 = new Employee("张三", 3000);
        Employee empl2 = new Employee("李四", 3500);
        Employee empl3 = new Employee("王五", 4000);
        Employee empl4 = new Employee("赵六", 4500);
        Employee empl5 = new Employee("田七", 5000);

        empleeArrL.add(empl1);
        empleeArrL.add(empl2);
        empleeArrL.add(empl3);
        empleeArrL.add(empl4);
        empleeArrL.add(empl5);

        // 1
        for (int i = 0; i < empleeArrL.size(); i++) {
            if ("王五".equals(empleeArrL.get(i).getName())) {
                empleeArrL.get(i).setName("王小五");
            }
        }

        // 2
        for (int i = 0; i < empleeArrL.size(); i++) {
            if ("赵六".equals(empleeArrL.get(i).getName())) {
                empleeArrL.remove(i);
            }
        }

        // 3
        for (int i = 0; i < empleeArrL.size(); i++) {
            if ("田七".equals(empleeArrL.get(i).getName())) {
                empleeArrL.get(i).setSalary(empleeArrL.get(i).getSalary() + 500);
            }
        }


        for (int i = 0; i < empleeArrL.size(); i++) {
            empleeArrL.get(i).show();
        }
    }
}
