package lesson07;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog: Woof Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

}