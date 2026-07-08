package lesson01;

public class Student {

    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void displayInfo() {
        System.out.println("===== Student Information =====");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Major : " + major);
    }
}