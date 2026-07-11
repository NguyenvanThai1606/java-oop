package lesson11;

public class Main {

    public static void main(String[] args) {

        try {

            Student student1 = new Student(
                    "SV001",
                    "Thai Nguyen",
                    20
            );

            student1.displayInfo();

            System.out.println();

            Student student2 = new Student(
                    "SV002",
                    "John Smith",
                    150
            );

            student2.displayInfo();

        } catch (InvalidAgeException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println();
            System.out.println("Program finished.");

        }

    }

}