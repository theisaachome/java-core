# Additional Practice Exercises - Java Collections

## Exercise 1: ArrayList Basics

Create an ArrayList of String and store:
- John
- Mary
- Sunny
- John

Tasks:
1. Print the list.
2. Find the size.
3. Check whether duplicates are allowed.

---

## Exercise 2: HashSet Duplicate Removal

```java
HashSet<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
set.add("Apple");
set.add("Orange");
```

Questions:
1. What is the output?
2. How many elements exist in the set?
3. Why is one element removed?

---

## Exercise 3: LinkedList Operations

Create a LinkedList<Integer>.

Add:
- 10
- 20
- 30
- 40

Tasks:
1. Add 5 at the beginning.
2. Add 50 at the end.
3. Remove 30.
4. Print the final list.

---

## Exercise 4: HashMap Practice

Create a HashMap<String,Integer>.

Store:
- John -> 85
- Mary -> 90
- Sunny -> 88

Tasks:
1. Print all entries.
2. Retrieve Mary's mark.
3. Update Sunny's mark to 95.
4. Count total entries.

---

## Exercise 5: Ascending Sort

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(40);
list.add(10);
list.add(70);
list.add(20);
```

Task:
Sort using Collections.sort().

Expected Output:
```text
[10, 20, 40, 70]
```

---

## Exercise 6: Descending Sort Using Comparator

Sort the following numbers in descending order:

```java
[10, 50, 20, 40, 30]
```

Requirement:
Use Comparator or Lambda Expression.

---

## Exercise 7: TreeSet Sorting

Insert:

```java
50, 10, 40, 20, 30
```

Tasks:
1. Print TreeSet in default order.
2. Create another TreeSet with descending order.

---

## Exercise 8: TreeMap Sorting

Insert:

```java
D=4
A=1
C=3
B=2
```

Questions:
1. What is the default order?
2. How can you reverse the order using Comparator?

---

## Exercise 9: Employee Object Sorting

Create Employee objects:

```java
(101, John)
(104, Sunny)
(102, Mary)
(103, James)
```

Tasks:
1. Sort by employee number ascending.
2. Sort by employee number descending.
3. Sort by employee name alphabetically.

---

## Exercise 10: List vs Set

Use the following data:

```java
A
B
C
A
B
D
```

Store the data in:
1. ArrayList
2. HashSet

Question:
Compare the outputs.

---

# Interview Questions

1. What is the difference between List and Set?
2. What is the difference between HashSet and TreeSet?
3. What is the difference between HashMap and TreeMap?
4. What is Comparator?
5. Why do we use Lambda Expressions?
6. Can HashSet store duplicate values?
7. Can HashMap have duplicate keys?
8. Which collection maintains insertion order?
9. Which collection automatically sorts values?
10. How do you sort custom objects?


---
## Interview Questions & Answers

### 1. What is the difference between List and Set?
**List** is an ordered collection that allows duplicate elements and positional indexed access. **Set** is an unordered collection of unique elements that strictly prevents duplicates.

### 2. What is the difference between HashSet and TreeSet?
**HashSet** stores elements in a hash table with no guaranteed iteration order and $O(1)$ constant-time operations. **TreeSet** stores elements in a Red-Black tree, keeping them automatically sorted in natural/comparator order with $O(\\log n)$ performance.

### 3. What is the difference between HashMap and TreeMap?
**HashMap** stores key-value pairs based on hashing, allowing one null key, with no order guaranteed. **TreeMap** sorts key-value pairs by key using their natural ordering or a provided `Comparator`, prohibiting null keys.

### 4. What is Comparator?
A functional interface (`java.util.Comparator`) used to define custom sorting logic for objects without modifying their class definition.

### 5. Why do we use Lambda Expressions?
They provide clear, concise syntax to implement single-method functional interfaces (like `Comparator` or `Runnable`), reducing boilerplate anonymous inner classes.

### 6. Can HashSet store duplicate values?
No. `HashSet` relies on `hashCode()` and `equals()` to prevent duplicate entries.

### 7. Can HashMap have duplicate keys?
No. Keys must be unique; inserting an existing key overwrites the old associated value. Values can be duplicated.

### 8. Which collection maintains insertion order?
`ArrayList`, `LinkedList`, and `LinkedHashSet` preserve insertion order.

### 9. Which collection automatically sorts values?
`TreeSet` (for elements) and `TreeMap` (for keys) sort entries automatically.

### 10. How do you sort custom objects?
Either by implementing the `Comparable` interface inside the class (`compareTo` method) or by passing a custom `Comparator` (via lambda or `Comparator.comparing()`) to `Collections.sort()` or `List.sort()`.

---

# Challenge Exercise

Create a Student Management Program.

Student Fields:
- id
- name
- marks

Requirements:
1. Store students in ArrayList.
2. Display all students.
3. Sort by marks descending.
4. Sort by name ascending.
5. Find the student with highest marks.
6. Store unique student names in HashSet.
7. Store student id and marks in HashMap.

This exercise combines List, Set, Map, Comparator, Collections.sort(), and Lambda Expressions.

```java
import java.util.*;

class Student {
    private final int id;
    private final String name;
    private final double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return String.format("Student[ID=%d, Name='%s', Marks=%.1f]", id, name, marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        // 1. Store students in ArrayList
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Sunny", 88.5));
        students.add(new Student(102, "Mary", 95.0));
        students.add(new Student(103, "John", 85.0));
        students.add(new Student(104, "Sunny", 92.0)); // Duplicate name, different ID

        // 2. Display all students
        System.out.println("--- All Students ---");
        students.forEach(System.out::println);

        // 3. Sort by marks descending
        students.sort(Comparator.comparingDouble(Student::getMarks).reversed());
        System.out.println("\n--- Sorted by Marks (Descending) ---");
        students.forEach(System.out::println);

        // 4. Sort by name ascending
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("\n--- Sorted by Name (Ascending) ---");
        students.forEach(System.out::println);

        // 5. Find student with highest marks
        Student topStudent = Collections.max(students, Comparator.comparingDouble(Student::getMarks));
        System.out.println("\nTop Student: " + topStudent);

        // 6. Store unique student names in HashSet
        Set<String> uniqueNames = new HashSet<>();
        for (Student s : students) {
            uniqueNames.add(s.getName());
        }
        System.out.println("\nUnique Names (HashSet): " + uniqueNames);

        // 7. Store student id and marks in HashMap
        Map<Integer, Double> studentMarksMap = new HashMap<>();
        for (Student s : students) {
            studentMarksMap.put(s.getId(), s.getMarks());
        }
        System.out.println("\nID to Marks Map (HashMap): " + studentMarksMap);
    }
}
```
