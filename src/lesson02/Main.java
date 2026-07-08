package lesson02;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(
                "SV001",
                "Thai Nguyen"
        );

        Student s3 = new Student(
                "SV002",
                "John",
                20
        );

        s2.displayInfo();

        s3.displayInfo();

    }

}