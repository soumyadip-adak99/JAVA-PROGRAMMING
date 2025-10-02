# Lambda Expressions in Java

## Introduction

Lambda expressions were introduced in **Java SE 8**. They provide a concise way to represent instances of **functional interfaces** (interfaces with a single abstract method). In simple terms, a lambda expression is an **anonymous function** (a function without a name).

---

## Without Lambda (Normal Expression)

```java
public class Main {
    public static void main(String[] args) {
        // Using anonymous inner class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
```

---

## With Lambda Expression

```java
public class Main {
    public static void main(String[] args) {
        // Using lambda expression
        Runnable runnable = () -> System.out.println("Hello");

        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
```

---

## What is a Functional Interface?

A **functional interface** is an interface that contains **only one abstract method**. It can have multiple default or static methods, but only one abstract method.

Example:

```java
@FunctionalInterface
public interface Student {
    String getBio(String name);
}
```

The `@FunctionalInterface` annotation is optional but recommended, as it ensures the interface cannot have more than one abstract method.

---

## Lambda Expression Syntax

```java
(parameters) -> { body }
```

Examples:

- No parameter: `() -> System.out.println("Hello")`
- Single parameter: `name -> name + " is a Student"`
- Multiple parameters: `(a, b) -> a + b`

---

## Example Without Lambda

```java
interface Student {
    String getBio(String name);
}

class EngineeringStudent implements Student {
    @Override
    public String getBio(String name) {
        return name + " is an Engineering Student!";
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new EngineeringStudent();
        System.out.println(student.getBio("Ram"));
    }
}
```

---

## Example With Lambda Expression

```java
interface Student {
    String getBio(String name);
}

public class Main {
    public static void main(String[] args) {
        // Implementing functional interface using lambda
        Student student = name -> name + " is a Student";

        System.out.println(student.getBio("Ram"));
    }
}
```

---

## ✅ Key Points to Remember

1. **Lambda = shorthand** for writing anonymous classes.
2. Can only be used with **functional interfaces**.
3. Helps write **cleaner and more readable code**.
4. Supports functional programming style in Java.

---

## 📌 Summary

- Lambda expressions reduce boilerplate code.
- They are mainly used with functional interfaces like `Runnable`, `Callable`, `Comparator`, etc.
- They improve readability and make Java closer to functional programming.
