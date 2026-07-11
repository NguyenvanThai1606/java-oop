package lesson09;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("SV001", "Thai Nguyen", 3.8));
        manager.addStudent(new Student("SV002", "John Smith", 3.5));
        manager.addStudent(new Student("SV003", "Alice", 3.9));

        System.out.println("===== All Students =====");

        manager.displayStudents();

        System.out.println();

        System.out.println("===== Find Student =====");

        manager.findStudent("SV002");

        System.out.println();

        System.out.println("===== Remove Student =====");

        manager.removeStudent("SV001");

        manager.displayStudents();

    }

}