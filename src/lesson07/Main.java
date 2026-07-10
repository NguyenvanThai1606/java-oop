package lesson07;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog();

        Animal cat = new Cat();

        dog.sound();
        dog.eat();

        System.out.println();

        cat.sound();
        cat.eat();

    }

}