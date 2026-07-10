package lesson08;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("SV001", "Thai Nguyen", 3.8));
        manager.addStudent(new Student("SV002", "John Smith", 3.5));
        manager.addStudent(new Student("SV003", "Alice", 3.9));

        manager.displayStudents();

    }

}