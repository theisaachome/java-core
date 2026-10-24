## Single responsibility principle

There should never be more than one reason for a class to change.

- focused,single functionality 
- address a specific concern


## Open-Closed Principle
- A class should be open for extension,
- but closed for modification.


---

## Liskov Substitution Principle
If class B extends class A, you should be able to replace an object of A with an object of B without breaking the program's expected behavior.

We should be able to substitute base class Objects with child class objects without breaking the application.
- A class should be able to replace its child class objects without breaking the application.
- A class should be able to replace its parent class objects without breaking the application.

#### Interview-ready answer:
The Liskov Substitution Principle states that objects of a superclass should be replaceable with objects of its subclasses without altering the correctness of the program.
For example, in a payment system, a credit card payment and an e-wallet payment should both be usable wherever a PaymentMethod is expected. If one implementation breaks the expected contract, it violates LSP.

#### A useful distinction: 
LSP is not simply about whether Java allows inheritance or interface implementation. 
It is about whether the replacement preserves the program's expected behavior.

---
## Interface Segregation Principle
Clients should not be forced to depend upon interfaces that they do not use.
Interface Pollution.

larger interface = more responsibility.
smaller interface = less responsibility.

- A client should not be forced to depend on methods it does not use.
- A class should be able to implement an interface that it uses.

#### Interview-ready answer:
The Interface Segregation Principle states that clients should not be forced to depend on methods they do not use.
Instead of creating one large interface, we should split it into smaller, specific interfaces based on capabilities. For example, a basic printer should not be forced to implement scanning and faxing methods.
We can create separate Printer, Scanner, and Fax interfaces. A basic printer implements only Printer, while a multifunction machine can implement all three. This makes the code easier to maintain, reduces unnecessary dependencies, and allows classes to implement only the functionality they support.


#### Common follow-up interview question
#### Q: Is it always better to create many small interfaces?

No. ISP does not mean creating an interface for every single method. Interfaces should group operations that naturally belong together and are used by the same kinds of clients.

The goal is to avoid forcing classes to implement unrelated operations, not to create unnecessary complexity.

#### Remember this shortcut:
- LSP: A child class must be a valid substitute for its parent.
- ISP: A class should not be forced to implement methods it doesn't need.

---

## Dependency Inversion Principle
High-level modules should not depend on low-level modules.
Both should depend on abstractions.

Abstractions should not depend on details.
Details should depend on abstractions.

### Dependency Inversion Principle (DIP) in Java
The Dependency Inversion Principle (DIP) is the D in the SOLID principles of object-oriented programming.

Simple definition: High-level classes should not depend directly on low-level classes. Both should depend on abstractions, such as interfaces.

In simple terms, instead of your main business logic depending on a specific implementation, make it depend on an interface.