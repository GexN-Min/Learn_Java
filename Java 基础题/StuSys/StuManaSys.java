package dev.stu.Remanager;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManaSys {


    ArrayList<Students> stuArr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String inputName = "";
    String inputBirth = "";
    int inputID = 0;
    int inputAge = 0;
    int input = 0;

    public void run() {

        lo: while (true) {

            System.out.println("----欢迎使用学生管理系统----");
            System.out.println("1. 创建学生");
            System.out.println("2. 查看全部学生");
            System.out.println("3. 删除学生");
            System.out.println("4. 修改学生");
            System.out.println("5. 退出");
            System.out.println("请输入您的选择：");
            try {
                input = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }

            switch (input) {
                case 1:
                    // System.out.println("创建学生");
                    addStu();
                    break;
                case 2:
                    // System.out.println("查看全部学生");
                    showAll();
                    break;
                case 3:
                    // System.out.println("删除学生");
                    delStu();
                    break;
                case 4:
                    // System.out.println("修改学生");
                    changeStu();
                    break;
                case 5:
                    System.out.println("系统退出，感谢您的使用。");
                    break lo;
            }

        }

    }

    public void addStu() {

        go: {
            try {
                System.out.println("请输入学生学号：");
                inputID = sc.nextInt();
                if (isStuIDEaqul(inputID)) {
                    System.out.println("学号重复");
                    break go;
                } else {
                    System.out.println("请输入学生姓名：");
                    inputName = sc.next();
                    System.out.println("请输入学生年龄：");
                    inputAge = sc.nextInt();
                    System.out.println("请输入学生生日：");
                    inputBirth = sc.next();
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
            Students stu = new Students(inputID, inputName, inputAge, inputBirth);
            stuArr.add(stu);
        }

    }

    public void showAll() {
        if (stuArr.size() == 0) {
            System.out.println("没有学生信息，请进行其他选择。");
        } else {
            System.out.println("\t学号\t\t姓名\t\t年龄\t\t生日\t");
            for (int i = 0; i < stuArr.size(); i++) {
                System.out.printf("\t%1d\t\t%s\t\t%d\t\t%s\t\n", stuArr.get(i).getStuID(), stuArr.get(i).getName(),
                        stuArr.get(i).getAge(), stuArr.get(i).getBirth());
            }
        }
    }

    public void delStu() {

        try {
            System.out.println("请输入您要删除的学生学号：");
            int inputID = sc.nextInt();
            for (int i = 0; i < stuArr.size(); i++) {
                if (stuArr.get(i).getStuID() == inputID) {
                    Students remove = stuArr.remove(i);
                    System.out.printf("%d号学生已经删除\n", remove.getStuID());
                } else {
                    System.out.println("您输入的学号有误！");
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public void changeStu() {
        try {
            System.out.println("请输入您要修改的学生学号：");
            int inputID = sc.nextInt();
            for (int i = 0; i < stuArr.size(); i++) {
                if (stuArr.get(i).getStuID() == inputID) {
                    System.out.println("请输入修改的学生姓名：");
                    inputName = sc.next();
                    System.out.println("请输入修改的学生年龄：");
                    inputAge = sc.nextInt();
                    System.out.println("请输入修改的学生生日：");
                    inputBirth = sc.next();

                    stuArr.get(i).setName(inputName);
                    stuArr.get(i).setAge(inputAge);
                    stuArr.get(i).setBirth(inputBirth);
                } else {
                    System.out.println("您输入的学号有误！");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean isStuIDEaqul(int inputID) {
        for (int i = 0; i < stuArr.size(); i++) {
            if (stuArr.get(i).getStuID() == inputID) {
                return true;
            }
        }
        return false;
    }
}
