# 📖 Lesson 05 - Polymorphism

## 🎯 Objectives

In this lesson, you will learn:

- Method Overriding
- Runtime Polymorphism
- Parent References
- Dynamic Method Dispatch

---

## 📚 Concepts

Polymorphism allows one parent reference to represent different child objects.

Instead of creating different methods for each class, we override the same method and let Java decide which implementation to execute at runtime.

---

## 📂 Project Structure

```
lesson05
│
├── Main.java
├── Person.java
├── Student.java
└── Teacher.java
```

---

## 🏗 Class Diagram

```
        Person
           ▲
      ┌────┴────┐
      │         │
 Student     Teacher
```

---

## 💻 Example

```java
Person person;

person = student;
person.displayInfo();

person = teacher;
person.displayInfo();
```

Java automatically calls the correct `displayInfo()` method depending on the actual object.

---

## 🧠 Key Concepts

- Inheritance
- Method Overriding
- Runtime Polymorphism
- Parent Reference
- Dynamic Dispatch

---

## ✅ Output

```
=== Normal Call ===

===== STUDENT =====
ID   : SV001
Name : Thai Nguyen
Age  : 20
GPA  : 3.8

===== TEACHER =====
ID   : GV001
Name : John Smith
Age  : 40
Subject : Java Programming

=== Polymorphism ===

===== STUDENT =====
ID   : SV001
Name : Thai Nguyen
Age  : 20
GPA  : 3.8

===== TEACHER =====
ID   : GV001
Name : John Smith
Age  : 40
Subject : Java Programming
```

---

## 🎓 What I Learned

- How method overriding works
- How Java chooses methods at runtime
- Why polymorphism is important in object-oriented programming
- Using parent references to manage multiple object types