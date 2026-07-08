package lesson03;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.setId("SV001");
        student.setName("Thai Nguyen");
        student.setAge(20);
        student.setGpa(3.8);
        student.setEmail("thainguyenvan359@gmail.com");
        student.setPhone("0123456789");

        student.displayInfo();

        System.out.println();

        // Kiểm tra validation
        student.setAge(-10);
        student.setGpa(5);
        student.setEmail("abcgmail.com");
        student.setPhone("123abc");

    }

}