package lesson04;

public class Teacher extends Person {

    private String subject;

    public Teacher(String id, String name, int age, String subject) {

        super(id, name, age);

        this.subject = subject;

    }

    public void displayTeacher() {

        displayInfo();

        System.out.println("Subject : " + subject);

    }

}