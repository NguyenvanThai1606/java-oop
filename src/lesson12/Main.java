package lesson12;

public class Main {

    public static void main(String[] args) {

        Box<Integer> numberBox = new Box<>();

        numberBox.set(100);

        System.out.println(numberBox.get());

        Box<String> textBox = new Box<>();

        textBox.set("Hello Java");

        System.out.println(textBox.get());

        Box<Student> studentBox = new Box<>();

        studentBox.set(new Student("Thai Nguyen"));

        System.out.println(studentBox.get());

    }

}