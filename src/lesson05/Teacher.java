package lesson05;

public class Teacher extends Person {

    private String subject;

    public Teacher(String id, String name, int age, String subject) {
        super(id, name, age);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {

        System.out.println("===== TEACHER =====");

        super.displayInfo();

        System.out.println("Subject : " + subject);
    }
}