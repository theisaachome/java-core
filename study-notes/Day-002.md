## 1. String

In Java, a String is an object that represents a sequence of characters. Unlike many other languages where strings are treated as character arrays, Java implements strings as objects of the java.lang.String class.

Immutability: Strings in Java are immutable, meaning once a String object is created, its state cannot be modified. 
Any operation that appears to modify a string (such as concatenation or substring extraction) actually creates and returns a brand-new String object in memory.

Syntax: Strings can be created using string literals (String s = "Hello";) or the new keyword (String s = new String("Hello");).

## 2. String Pool
   The String Pool (or String Intern Pool) is a special region of memory located within the Java Heap.

Memory Optimization: Because strings are immutable, Java stores literal strings in the String Pool to save memory. If two variables are assigned the exact same string literal, Java points both variables to the exact same memory address in the pool rather than creating duplicate objects.

Literals vs. new:

String s1 = "Java"; checks the String Pool. If "Java" exists, s1 points to it. If not, it creates it in the pool.

String s2 = new String("Java"); creates a new object in the general heap regardless of whether "Java" already exists in the String Pool. You can use the .intern() method to manually add a heap string to the pool.

## 3. StringBuilder
   StringBuilder is a mutable sequence of characters introduced in Java 5 to handle heavy string manipulation efficiently.

Mutability: Unlike String, modifying a StringBuilder object (using methods like .append(), .insert(), or .delete()) alters the original object in memory without creating new ones, drastically reducing memory overhead and garbage collection pressure.

Thread Safety: StringBuilder is not synchronized, meaning it is not thread-safe. However, because it lacks the overhead of thread synchronization, it is faster than StringBuffer and is the preferred choice for single-threaded environments.

## 4. StringBuffer
   StringBuffer is the older, thread-safe counterpart to StringBuilder.

Mutability: Just like StringBuilder, it represents a mutable sequence of characters.

Thread Safety: All public methods in StringBuffer are synchronized. This ensures that multiple threads can safely modify a StringBuffer instance concurrently without data corruption.

Performance: Because of the performance cost associated with synchronization, StringBuffer is slower than StringBuilder and is typically only used when thread-safe string mutation is explicitly required.

## 5. Implement String-Reversal Utilities
   Here is a practical implementation of string-reversal utilities in Java using different approaches.

Approach 1: Using StringBuilder (Most Efficient & Idiomatic)