package lesson07;

public class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat: Meow Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

}