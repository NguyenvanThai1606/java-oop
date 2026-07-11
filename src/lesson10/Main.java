package lesson10;

public class Main {

    public static void main(String[] args) {

        FileManager fileManager = new FileManager();

        fileManager.writeFile();

        System.out.println();

        System.out.println("===== Read File =====");

        fileManager.readFile();

    }

}