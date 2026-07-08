package lesson03;

public class Student {

    private String id;
    private String name;
    private int age;
    private double gpa;
    private String email;
    private String phone;

    public Student() {
    }

    public Student(String id, String name, int age,
               double gpa, String email, String phone) {

    this.id = id;
    this.name = name;

    setAge(age);
    setGpa(gpa);
    setEmail(email);
    setPhone(phone);
}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age >= 0 && age <= 120){
            this.age = age;
        }else{
            System.out.println("Invalid age!");
        }

    }

    public double getGpa() {
    return gpa;
}

public void setGpa(double gpa) {

    if (gpa >= 0 && gpa <= 4) {
        this.gpa = gpa;
    } else {
        System.out.println("Invalid GPA!");
    }

}

public String getEmail() {
    return email;
}

public void setEmail(String email) {

    if (email.contains("@")) {
        this.email = email;
    } else {
        System.out.println("Invalid email!");
    }

}

public String getPhone() {
    return phone;
}

public void setPhone(String phone) {

    if (phone.matches("\\d{10}")) {
        this.phone = phone;
    } else {
        System.out.println("Invalid phone number!");
    }

}

    public void displayInfo() {

    System.out.println("=================================");
    System.out.println("      STUDENT INFORMATION");
    System.out.println("=================================");

    System.out.println("ID     : " + id);
    System.out.println("Name   : " + name);
    System.out.println("Age    : " + age);
    System.out.println("GPA    : " + gpa);
    System.out.println("Email  : " + email);
    System.out.println("Phone  : " + phone);

    System.out.println("=================================");

}

}