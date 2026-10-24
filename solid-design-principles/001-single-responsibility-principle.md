## Single responsibility principle

There should never be more than one reason for a class to change.

- focused,single functionality 
- address a specific concern


## Open-Closed Principle
- A class should be open for extension,
- but closed for modification.


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

## Interface Segregation Principle
Clients should not be forced to depend upon interfaces that they do not use.
Interface Pollution.

larger interface = more responsibility.
smaller interface = less responsibility.

- A client should not be forced to depend on methods it does not use.
- A class should be able to implement an interface that it uses.
