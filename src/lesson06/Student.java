package lesson06;

public class Student extends Person {

    private double gpa;

    public Student(String id, String name, int age, double gpa) {
        super(id, name, age);
        this.gpa = gpa;
    }

    @Override
    public void showRole() {
        System.out.println("Role : Student");
    }

    @Override
    public void displayInfo() {
        System.out.println("===== STUDENT =====");
        super.displayInfo();
        System.out.println("GPA  : " + gpa);
    }
}