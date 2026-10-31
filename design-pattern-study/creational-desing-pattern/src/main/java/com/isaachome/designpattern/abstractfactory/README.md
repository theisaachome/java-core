# Abstract Factory Design Pattern Study Notes

## Overview

The **Abstract Factory** pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It allows you to produce objects of different types that belong to the same family.

## Key Components

### 1. Abstract Factory Interface
Defines methods to create abstract products. Each concrete factory implements this interface to create products of a specific family.

### 2. Concrete Factories
Implement the abstract factory interface to create concrete products that belong to a specific family.

### 3. Abstract Product Interfaces
Define the contract for each type of product that can be created.

### 4. Concrete Products
Implement the abstract product interfaces and are created by concrete factories.

### 5. Client
Uses the abstract factory and abstract product interfaces to work with products without knowing their concrete implementations.

## Structure Diagram

```
AbstractFactory
├── createProductA()
├── createProductB()
└── createProductC()

ConcreteFactory1 implements AbstractFactory
├── createProductA() → ConcreteProductA1
├── createProductB() → ConcreteProductB1
└── createProductC() → ConcreteProductC1

ConcreteFactory2 implements AbstractFactory
├── createProductA() → ConcreteProductA2
├── createProductB() → ConcreteProductB2
└── createProductC() → ConcreteProductC2
```

## Example 1: Furniture Shop Application

### Package Structure
```
abstractfactory/furniture/
├── FurnitureFactory.java (Abstract Factory)
├── FurnitureShopApp.java (Client)
├── ModerFurnitureFactory.java (Concrete Factory)
├── VictorianFurnitureFactory.java (Concrete Factory)
├── product/
│   ├── Chair.java (Abstract Product)
│   ├── Sofa.java (Abstract Product)
│   └── CoffeeTable.java (Abstract Product)
├── modern/
│   ├── ModernChair.java (Concrete Product)
│   ├── ModernSofa.java (Concrete Product)
│   └── ModernCoffeeTable.java (Concrete Product)
└── victorian/
    ├── VictorianChair.java (Concrete Product)
    ├── VictorianSofa.java (Concrete Product)
    └── VictorianCoffeeTable.java (Concrete Product)
```

### Key Classes

**FurnitureFactory.java**
- Abstract factory interface
- Methods: `createChair()`, `createSofa()`, `createCoffeeTable()`

**ModerFurnitureFactory.java**
- Creates Modern-style furniture products
- Returns: ModernChair, ModernSofa, ModernCoffeeTable

**VictorianFurnitureFactory.java**
- Creates Victorian-style furniture products
- Returns: VictorianChair, VictorianSofa, VictorianCoffeeTable

**FurnitureShopApp.java**
- Client class
- Uses factory to create compatible furniture sets
- Method: `displayFurniture()` to demonstrate functionality

### Usage Example
```java
// Create a Modern furniture set
FurnitureFactory factory = new ModerFurnitureFactory();
FurnitureShopApp shop = new FurnitureShopApp(factory);
shop.displayFurniture();
// Output:
// Sitting on a Modern Chair
// Lying on a Modern Sofa
// Placing items on a Modern Coffee Table

// Create a Victorian furniture set
FurnitureFactory factory02 = new VictorianFurnitureFactory();
FurnitureShopApp shop02 = new FurnitureShopApp(factory02);
shop02.displayFurniture();
// Output:
// Sitting on a Victorian Chair
// Lying on a Victorian Sofa
// Placing items on a Victorian Coffee Table
```

## Example 2: Banking Application

### Package Structure
```
abstractfactory/bank/
├── BankingFactory.java (Abstract Factory)
├── BankingApplication.java (Client)
├── BankAppMain.java (Main Entry Point)
├── CIMBFactory.java (Concrete Factory)
├── MayBankFactory.java (Concrete Factory)
├── AccountService.java (Abstract Product)
├── NotificationService.java (Abstract Product)
├── PaymentService.java (Abstract Product)
├── CIMBAccount.java (Concrete Product)
├── CIMBNotification.java (Concrete Product)
├── CIMBPayment.java (Concrete Product)
├── MayBankAccount.java (Concrete Product)
├── MayBankNotification.java (Concrete Product)
└── MayBankPayment.java (Concrete Product)
```

### Key Classes

**BankingFactory.java**
- Abstract factory interface
- Methods: `createPayment()`, `createAccount()`, `createNotification()`

**CIMBFactory.java**
- Creates CIMB-specific banking services
- Returns: CIMBPayment, CIMBAccount, CIMBNotification

**MayBankFactory.java**
- Creates MayBank-specific banking services
- Returns: MayBankPayment, MayBankAccount, MayBankNotification

**BankingApplication.java**
- Client class
- Uses factory to create compatible banking services
- Method: `execute()` to demonstrate banking operations

### Usage Example
```java
// Create MayBank banking application
BankingFactory bankFactory = new MayBankFactory();
BankingApplication application = new BankingApplication(bankFactory);
application.execute();
// Output:
// Creating MayBank account for Isaac
// Processing MayBank payment for RM: 5000.0
// Sending Maybank notification: Payment successful

// Create CIMB banking application
BankingFactory cimbFactory = new CIMBFactory();
BankingApplication cimbApp = new BankingApplication(cimbFactory);
cimbApp.execute();
// Output:
// CIMB Account Created for Isaac
// Processing CIMB payment for RM: 5000.0
// CIMB Notification: Payment successful
```

## Benefits

1. **Consistency**: Ensures products from the same family are compatible
2. **Loose Coupling**: Client code is decoupled from concrete product classes
3. **Open/Closed Principle**: Easy to introduce new product families without modifying existing code
4. **Single Responsibility**: Each factory is responsible for creating its specific family of products

## When to Use

- When your system needs to work with multiple families of related products
- When you want to provide a library of products without exposing implementation details
- When you need to enforce consistency among products from the same family
- When you want to isolate concrete classes from the client code

## Limitations

- Complexity increases as new product types are added (requires changes to all factory interfaces)
- Can lead to class explosion due to the number of interfaces and classes required

## Comparison with Factory Method

| Aspect | Abstract Factory | Factory Method |
|--------|------------------|----------------|
| Scope | Creates families of related products | Creates single product |
| Level | Higher-level creational pattern | Lower-level creational pattern |
| Usage | When you need multiple product families | When you need one product with variations |
| Implementation | Uses composition | Uses inheritance |

## Running the Examples

### Furniture Example
```bash
# Navigate to the FurnitureShopApp class and run the main() method
# Or compile and run:
javac FurnitureShopApp.java
java com.isaachome.designpattern.abstractpattern.furniture.FurnitureShopApp
```

### Banking Example
```bash
# Navigate to the BankAppMain class and run the main() method
# Or compile and run:
javac BankAppMain.java
java com.isaachome.designpattern.abstractfactory.bank.BankAppMain
```

## Summary

The Abstract Factory pattern is essential when you need to create families of related objects while maintaining consistency within each family. Both examples demonstrate how the pattern allows easy switching between different implementations (Modern/Victorian furniture, CIMB/MayBank banking) without modifying the client code.
