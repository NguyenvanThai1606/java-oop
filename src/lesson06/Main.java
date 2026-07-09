package lesson06;

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

        student.displayInfo();
        student.showRole();

        System.out.println();

        teacher.displayInfo();
        teacher.showRole();
    }
}