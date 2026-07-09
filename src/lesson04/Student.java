package lesson04;

public class Student extends Person {

    private double gpa;

    public Student(String id, String name, int age, double gpa) {

        super(id, name, age);

        this.gpa = gpa;
    }

    public void displayStudent() {

        displayInfo();

        System.out.println("GPA  : " + gpa);

    }

}