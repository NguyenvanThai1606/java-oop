package lesson05;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(
                "SV001",
                "Thai Nguyen",
                20,
                3.8
        );

        Teacher teacher = new Teacher(
                "GV001",
                "John Smith",
                40,
                "Java Programming"
        );

        System.out.println("=== Normal Call ===");

        student.displayInfo();

        System.out.println();

        teacher.displayInfo();

        System.out.println();

        System.out.println("=== Polymorphism ===");

        Person person;

        person = student;
        person.displayInfo();

        System.out.println();

        person = teacher;
        person.displayInfo();
    }
}