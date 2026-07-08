package lesson02;

public class Student {

    private String id;
    private String name;
    private int age;

    public Student() {
        System.out.println("Default Constructor");
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("---------------------");
    }
}