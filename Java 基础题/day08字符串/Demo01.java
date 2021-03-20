import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请录入工人姓名：");
        String name = sc.nextLine();
        System.out.println("请录入工人工龄：");
        int age = sc.nextInt();

        Worker w = new Worker(name, age);
        w.show();
    }
}
