package lesson09;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {

    private HashMap<String, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void displayStudents() {

        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.println(entry.getValue());
        }

    }

    public void findStudent(String id) {

        if (students.containsKey(id)) {
            System.out.println(students.get(id));
        } else {
            System.out.println("Student not found.");
        }

    }

    public void removeStudent(String id) {

        students.remove(id);

    }

}