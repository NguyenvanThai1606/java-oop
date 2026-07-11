package lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("SV001", "Thai Nguyen", 3.8));
        students.add(new Student("SV002", "John Smith", 3.2));
        students.add(new Student("SV003", "Alice", 3.9));
        students.add(new Student("SV004", "David", 2.8));

        System.out.println("===== All Students =====");

        students.forEach(System.out::println);

        System.out.println();

        System.out.println("===== GPA >= 3.5 =====");

        students.stream()
                .filter(student -> student.getGpa() >= 3.5)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("===== Student Names =====");

        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("===== Sort By GPA =====");

        students.stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .forEach(System.out::println);

        System.out.println();

        System.out.println("===== Collect To List =====");

        List<Student> excellentStudents = students.stream()
                .filter(student -> student.getGpa() >= 3.5)
                .collect(Collectors.toList());

        excellentStudents.forEach(System.out::println);

    }

}