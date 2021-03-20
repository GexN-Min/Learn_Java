package dev.stu.Remanager;

public class Students {

    private int stuID;
    private String name;
    private int age;
    private String birth;

    public Students() {

    }

    public Students(int stuID, String name, int age, String birth) {
        this.stuID = stuID;
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public int getStuID() {
        return stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
