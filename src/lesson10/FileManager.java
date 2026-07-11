package lesson10;

import java.io.*;

public class FileManager {

    public void writeFile() {

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("src/lesson10/students.txt"))) {

            writer.write("SV001,Thai Nguyen,3.8");
            writer.newLine();

            writer.write("SV002,John Smith,3.5");
            writer.newLine();

            writer.write("SV003,Alice,3.9");

            System.out.println("Write file successfully.");

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }

    public void readFile() {

        try (BufferedReader reader = new BufferedReader(
                new FileReader("src/lesson10/students.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);

            }

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }

}