# Java Collections Study Notes

## 1. What is a Collection?
A **collection** is a group of objects/items stored together.

Examples:
- Collection of books
- Collection of pens
- Collection of items

In Java, the **Collections Framework** provides classes and interfaces to store and manage groups of objects.

---

# Java Collections Framework

Main interfaces:
1. List
2. Set
3. Map

---

## 2. List Interface

### Characteristics
- Maintains insertion order
- Allows duplicate elements
- Index-based access

### Common Implementations
- ArrayList
- LinkedList
- Vector
- Stack (legacy class extending Vector)

### Example: ArrayList
```java
ArrayList<String> list = new ArrayList<>();

list.add("John");
list.add("James");
list.add("Johnny");
list.add("Johnny");
list.add("Sunny");

System.out.println(list);
```

Output:
```text
[John, James, Johnny, Johnny, Sunny]
```

Note: Duplicate values are allowed.

---

## 3. Set Interface

### Characteristics
- Does not allow duplicates
- No index-based access
- Primarily used when uniqueness is required

### Common Implementations
- HashSet
- TreeSet (used for sorted data)

### Example: HashSet
```java
HashSet<String> hs = new HashSet<>();

hs.add("Sunny");
hs.add("Bunny");
hs.add("Chinny");
hs.add("Sunny");

System.out.println(hs);
```

Output:
```text
[Sunny, Bunny, Chinny]
```

Note: Duplicate entries are automatically removed.

---

## 4. Map Interface

### Characteristics
- Stores data as key-value pairs
- Keys must be unique
- Values can be duplicated

### Real-world Examples
- Roll Number → Name
- Mobile Number → Address

### Common Implementation
- HashMap

### Example: HashMap
```java
HashMap<String, String> map = new HashMap<>();

map.put("A", "Apple");
map.put("B", "Ball");
map.put("Z", "Zebra");
map.put("D", "Denny");

System.out.println(map);
```

---

# 5. Comparator Interface

A **Comparator** is used to define custom sorting logic.

### Important Method
```java
compare(Object obj1, Object obj2)
```

### Return Values
```java
public int compare(Object obj1, Object obj2) {
    // Negative: obj1 comes before obj2
    // Positive: obj1 comes after obj2
    // Zero: objects are equal
}
```

---

# 6. Collections Sorting (Default)

### Example
```java
ArrayList<Integer> list = new ArrayList<>();

list.add(0);
list.add(1);
list.add(2);
list.add(3);
list.add(4);

System.out.println(list);

Collections.sort(list);
```

Output:
```text
[0, 1, 2, 3, 4]
```

By default, sorting is in ascending order.

---

# 7. Custom Comparator Example

### Descending Order Sort

```java
class MyComparator implements Comparator<Integer> {

    public int compare(Integer i1, Integer i2) {
        if (i1 > i2) {
            return -1;
        } else if (i1 < i2) {
            return 1;
        } else {
            return 0;
        }
    }
}
```

Usage:

```java
Collections.sort(list, new MyComparator());
```

Result:
```text
Descending Order
```

---

# 8. Collections Sorting with Lambda Expression

Instead of creating a separate Comparator class:

```java
Collections.sort(
    list,
    (a, b) -> (a > b) ? -1 : (a < b) ? 1 : 0
);
```

This sorts the list in descending order.

---

# 9. TreeSet Sorting with Lambda

### Default Sorting

```java
TreeSet<Integer> tree = new TreeSet<>();
```

Default: Ascending order.

### Custom Sorting

```java
TreeSet<Integer> tree = new TreeSet<>(
    (a, b) -> (a > b) ? -1 : (a < b) ? 1 : 0
);
```

### Example

```java
tree.add(10);
tree.add(0);
tree.add(15);
tree.add(5);
tree.add(25);
tree.add(20);
tree.add(14);
```

Result: Elements stored in descending order.

---

# 10. TreeMap Sorting with Lambda

```java
TreeMap<String, Integer> map = new TreeMap<>(
    (a, b) -> (a.compareTo(b) > 0) ? -1 :
              (a.compareTo(b) < 0) ? 1 : 0
);

map.put("A", 10);
map.put("B", 20);
map.put("D", 30);
map.put("C", 40);
```

Result: Keys are sorted in descending order.

---

# 11. Custom Object Sorting with Lambda

### Employee Class

```java
class Employee {
    private int eno;
    private String ename;

    public Employee(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }
}
```

### Create Employee List

```java
ArrayList<Employee> employeeList = new ArrayList<>();

employeeList.add(new Employee(200, "John"));
employeeList.add(new Employee(300, "James"));
employeeList.add(new Employee(400, "Mary"));
employeeList.add(new Employee(500, "Aye Aye"));
```

### Sort by Employee Number (Descending)

```java
Collections.sort(
    employeeList,
    (e1, e2) -> (e1.eno > e2.eno) ? -1 :
                (e1.eno < e2.eno) ? 1 : 0
);
```

---

# Quick Interview Notes

## List vs Set

- List allows duplicates.
- Set does not allow duplicates.
- List maintains insertion order.
- Set focuses on uniqueness.

## HashSet vs TreeSet

- HashSet: Fast, no sorting.
- TreeSet: Automatically sorted.

## HashMap vs TreeMap

- HashMap: No ordering.
- TreeMap: Sorted by keys.

## Comparator

Used for:
- Custom sorting
- Descending sorting
- Sorting custom objects
- Lambda-based sorting

---

# Exam Summary

✅ List = Ordered + Duplicates Allowed

✅ Set = No Duplicates

✅ Map = Key-Value Pair

✅ HashSet = Unique Elements

✅ TreeSet = Sorted Set

✅ HashMap = Key-Value Storage

✅ TreeMap = Sorted Map

✅ Comparator = Custom Sorting Logic

✅ Lambda = Shorter Comparator Syntax
