package lesson01;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Thai Nguyen",20,"IT");
        student.displayInfo();

        System.out.println();

        Car car = new Car("Toyota","Camry");
        car.displayInfo();

        Book book = new Book("Clean Code","Robert C. Martin");
        book.displayInfo();

        Employee employee = new Employee("Alex",1200);
        employee.displayInfo();
    }

}