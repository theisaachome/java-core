# Java Lambda Expressions & Functional Interfaces - Practice Exercises

## Exercise 1: First Lambda Expression

Convert the following anonymous class into a lambda expression:

```java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello Lambda");
    }
};
```

---

## Exercise 2: Lambda with Parameters

Create a lambda expression that:

1. Accepts two integers.
2. Prints their sum.

Expected:

```java
(a,b) -> System.out.println(a+b)
```

---

## Exercise 3: Lambda Returning a Value

Create a lambda expression that calculates:

```text
square(number)
```

Examples:

```text
square(5) = 25
square(10) = 100
```

---

## Exercise 4: String Length

Create a lambda expression that returns the length of a string.

Example:

```text
Input : Java
Output: 4
```

---

## Exercise 5: Even or Odd

Create a functional interface:

```java
interface CheckNumber {
    boolean test(int num);
}
```

Using lambda expression:

1. Return true if the number is even.
2. Return false if the number is odd.

---

## Exercise 6: Maximum Number

Write a lambda expression that returns the larger value between two numbers.

Example:

```text
Input : 10, 20
Output: 20
```

---

## Exercise 7: Custom Functional Interface

Create:

```java
@FunctionalInterface
interface Greeting {
    void greet(String name);
}
```

Use lambda expression to print:

```text
Hello John
Hello Mary
```

---

## Exercise 8: Calculator Using Lambda

Create a functional interface:

```java
interface Calculator {
    int calculate(int a, int b);
}
```

Implement using lambda:

1. Addition
2. Subtraction
3. Multiplication
4. Division

---

## Exercise 9: Sorting Using Lambda

Given:

```java
ArrayList<Integer> list = Arrays.asList(10,50,20,40,30);
```

Tasks:

1. Sort ascending.
2. Sort descending.
3. Print result.

---

## Exercise 10: Employee Sorting

Create Employee objects:

```text
101 John
104 Sunny
102 Mary
103 James
```

Use lambda expressions to:

1. Sort by employee id ascending.
2. Sort by employee id descending.
3. Sort by employee name.

---

## Exercise 11: Runnable Practice

Using a lambda expression:

```java
Runnable r = () -> {
    for(int i=1;i<=5;i++){
        System.out.println(i);
    }
};
```

Execute the thread.

---

## Exercise 12: Lambda and Collections

Given:

```java
List<String> names = Arrays.asList(
    "John",
    "Mary",
    "Sunny",
    "James"
);
```

Use forEach() with lambda to display all names.

---

## Exercise 13: Functional Interface Validation

Identify whether the following interfaces are functional interfaces.

### A

```java
interface A {
    void m1();
}
```

### B

```java
interface B {
    void m1();
    void m2();
}
```

### C

```java
interface C {
    void m1();
    default void m2(){}
}
```

---

## Exercise 14: Stream API with Lambda

Given:

```java
List<Integer> numbers = Arrays.asList(10,15,20,25,30);
```

Tasks:

1. Print only even numbers.
2. Print only odd numbers.
3. Calculate total sum.

---

## Exercise 15: Predicate Lambda

Create:

```java
Predicate<String> p
```

Tasks:

1. Check whether string length is greater than 5.
2. Test with:
   - Java
   - Lambda
   - FunctionalInterface

---

# Mini Project

## Student Management System

Create a Student class.

Fields:

```text
id
name
marks
```

Requirements:

1. Store students in ArrayList.
2. Use lambda to sort by id.
3. Use lambda to sort by name.
4. Use lambda to sort by marks descending.
5. Display students using forEach().
6. Find highest mark using Stream API.
7. Filter students with marks > 80.

---

# Interview Challenge Questions

1. What is the difference between an anonymous class and a lambda expression?
2. Why must lambda expressions use functional interfaces?
3. Can a functional interface contain static methods?
4. Can a functional interface contain default methods?
5. What is type inference in lambda expressions?
6. Why is @FunctionalInterface recommended?
7. What happens if a second abstract method is added?
8. What are the advantages of lambda expressions?
9. How are lambda expressions used in Collections sorting?
10. How are lambda expressions used in Stream API?

---

# Exam-Oriented Coding Questions

1. Reverse sort a List using lambda.
2. Sort Employee objects by salary.
3. Count strings longer than 5 characters.
4. Print all even numbers using Stream API.
5. Find maximum number from a List using lambda.
6. Create a Calculator using four lambda expressions.
7. Create a custom functional interface and implement it with lambda.
8. Filter employees whose salary is greater than 5000.
9. Sort HashMap entries by key using TreeMap and lambda.
10. Write a lambda that checks whether a string is a palindrome.
