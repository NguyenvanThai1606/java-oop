# 📖 Lesson 06 - Abstract Class

## 🎯 Objectives

In this lesson, you will learn:

- Abstract Class
- Abstract Method
- Code Reusability
- Prevent Direct Object Creation

---

## 📚 Concepts

An abstract class cannot be instantiated directly.

It is designed to be a base class for other classes.

Abstract methods define behavior that every subclass must implement.

---

## 📂 Project Structure

```
lesson06
│
├── Main.java
├── Person.java
├── Student.java
└── Teacher.java
```

---

## 🏗 Class Diagram

```
           Person (abstract)
                 ▲
          ┌──────┴──────┐
          │             │
      Student       Teacher
```

---

## 💻 Example

```java
public abstract class Person {

    public abstract void showRole();

}
```

Student

```java
@Override
public void showRole() {
    System.out.println("Role : Student");
}
```

Teacher

```java
@Override
public void showRole() {
    System.out.println("Role : Teacher");
}
```

---

## 🧠 Key Concepts

- Abstract Class
- Abstract Method
- Method Overriding
- Inheritance
- Code Reusability

---

## ✅ Output

```
===== STUDENT =====
ID   : SV001
Name : Thai Nguyen
Age  : 20
GPA  : 3.8
Role : Student

===== TEACHER =====
ID   : GV001
Name : John Smith
Age  : 40
Subject : Java Programming
Role : Teacher
```

---

## 🎓 What I Learned

- Creating abstract classes
- Declaring abstract methods
- Implementing abstract methods in subclasses
- Preventing object creation from abstract classes
- Designing reusable class hierarchies