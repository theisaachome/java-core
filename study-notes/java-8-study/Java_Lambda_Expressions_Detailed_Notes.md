# Java Lambda Expressions and Functional Interfaces

## Why Lambda Expressions Were Introduced in Java

Lambda expressions were introduced in Java 8 to support **Functional Programming** concepts and to make code more concise, readable, and maintainable.

### Benefits of Lambda Expressions

- Reduce boilerplate code.
- Improve code readability.
- Enable functional programming features.
- Simplify the implementation of functional interfaces.
- Commonly used with the Stream API and Collections framework.

---

# What Is a Lambda Expression?

A **Lambda Expression** is an anonymous function.

An anonymous function means:

- It does not have a name.
- It does not have access modifiers such as `public`, `private`, or `protected`.
- It does not require an explicit return type.
- It can be passed as an argument to a method.

## General Syntax

```java
(parameter_list) -> expression
```

or

```java
(parameter_list) -> {
    // multiple statements
}
```

## Example: Traditional vs Lambda

### Traditional Approach

```java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
};
```

### Lambda Expression

```java
Runnable r = () -> System.out.println("Hello World");
```

The lambda version is shorter and easier to read.

---

# Characteristics of Lambda Expressions

## 1. Lambda Expressions Can Take Any Number of Parameters

Examples:

```java
() -> System.out.println("Hello")
```

```java
(s) -> s.length()
```

```java
(a, b) -> System.out.println(a + b)
```

---

## 2. Multiple Parameters Must Be Separated by Commas

Correct:

```java
(a, b) -> System.out.println(a + b)
```

Incorrect:

```java
(a b) -> System.out.println(a + b)
```

---

## 3. Parentheses Are Optional for a Single Parameter

These two statements are equivalent:

```java
(s) -> s.length()
```

```java
s -> s.length()
```

When there is only one parameter and the type is omitted, parentheses may be removed.

---

## 4. Type Inference

The Java compiler can determine parameter types automatically.

### Explicit Types

```java
(int a, int b) -> System.out.println(a + b)
```

### Using Type Inference

```java
(a, b) -> System.out.println(a + b)
```

Java automatically infers that both parameters are integers based on the target functional interface.

---

## 5. Lambda Bodies

### Single Statement

```java
(a, b) -> a + b
```

When only one statement exists, braces are optional.

### Multiple Statements

```java
(a, b) -> {
    int sum = a + b;
    return sum;
}
```

When using multiple statements:

- Curly braces are required.
- The `return` keyword is required if a value is returned.

---

# Functional Interface

## What Is a Functional Interface?

A Functional Interface is an interface that contains **exactly one abstract method**.

It is also known as a:

- SAM Interface
- Single Abstract Method Interface

Lambda expressions can only be used with Functional Interfaces.

---

## Common Examples

### Runnable

```java
public interface Runnable {
    void run();
}
```

Contains only one abstract method:

```java
run()
```

---

### Callable

```java
public interface Callable<V> {
    V call() throws Exception;
}
```

Contains only one abstract method:

```java
call()
```

---

### ActionListener

```java
void actionPerformed(ActionEvent e)
```

Contains only one abstract method.

---

# @FunctionalInterface Annotation

Java provides the `@FunctionalInterface` annotation.

## Purpose

- Indicates that an interface is intended to be a functional interface.
- Enables compile-time validation.
- Prevents accidental addition of multiple abstract methods.

Example:

```java
@FunctionalInterface
interface MyInterface {
    void display();
}
```

---

# Functional Interfaces and Inheritance

## Case 1: Child Interface Does Not Add New Abstract Methods

If a child interface extends a functional interface and does not declare any additional abstract methods, it remains a functional interface.

```java
@FunctionalInterface
interface A {
    void m1();
}

@FunctionalInterface
interface B extends A {
}
```

Result:

`B` is still a functional interface.

---

## Case 2: Child Interface Redeclares the Same Abstract Method

A child interface may redeclare the same abstract method inherited from the parent.

```java
@FunctionalInterface
interface P {
    void m1();
}

@FunctionalInterface
interface C extends P {
    void m1();
}
```

Result:

- No additional abstract method is created.
- `C` is still a functional interface.

---

## Case 3: Child Interface Adds a New Abstract Method

```java
@FunctionalInterface
interface P {
    void m1();
}

interface C extends P {
    void m1();
    void m2();
}
```

Result:

- Total abstract methods = 2
- Not a functional interface.

If `@FunctionalInterface` is added, a compilation error occurs.

---

## Case 4: Interface Without @FunctionalInterface Annotation

```java
interface P {
    void m1();
}

interface C extends P {
    void m1();
    void m2();
}
```

Result:

- Compiles successfully.
- However, `C` is not a functional interface because it contains two abstract methods.
- Lambda expressions cannot be used with `C`.

---

# Key Interview Questions

### Q1: What is a Lambda Expression?

A Lambda Expression is an anonymous function used to provide the implementation of a functional interface.

### Q2: What is a Functional Interface?

An interface containing exactly one abstract method.

### Q3: Can a Functional Interface Have Default Methods?

Yes. A functional interface may contain:

- One abstract method
- Multiple default methods
- Multiple static methods

### Q4: Why Was Lambda Introduced?

To support functional programming and reduce boilerplate code.

### Q5: Can Lambda Expressions Be Used Without a Functional Interface?

No. Lambda expressions require a target functional interface.

---

# Summary

- Lambda Expressions were introduced in Java 8.
- A lambda is an anonymous function.
- Lambdas require a Functional Interface.
- A Functional Interface contains exactly one abstract method.
- `@FunctionalInterface` provides compile-time validation.
- Child interfaces remain functional only if they do not introduce additional abstract methods.
- Lambda expressions greatly simplify Java code and are heavily used with Streams and Collections.
