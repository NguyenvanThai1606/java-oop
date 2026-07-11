package lesson11;

public class Student {

    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age)
            throws InvalidAgeException {

        this.id = id;
        this.name = name;

        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }

        this.age = age;
    }

    public void displayInfo() {

        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);

    }

}