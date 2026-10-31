# Simple Factory Design Pattern - Study Notes

## Overview

The Simple Factory pattern is a creational design pattern that provides a static method to create objects without exposing the instantiation logic to the client. It encapsulates object creation logic in a separate class, making the code more maintainable and flexible.

## Key Components

### 1. Product Interface
Defines the common interface that all concrete products must implement.

```java
interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}
```

### 2. Concrete Products
Classes that implement the product interface with specific implementations.

```java
class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Pepperoni Pizza");
    }
}

class HawaiianPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Hawaiian Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Hawaiian Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Hawaiian Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Hawaiian Pizza");
    }
}
```

### 3. Factory Class
Contains the static method that creates and returns objects based on input parameters.

```java
public class PizzaFactory {
    private PizzaFactory() {
    }

    public static Pizza getInstanceOf(String pizzaType) {
        if (pizzaType == null) {
            throw new IllegalArgumentException("Pizza type cannot be null");
        }
        return switch (pizzaType) {
            case "pepperoni" -> new PepperoniPizza();
            case "hawaiian" -> new HawaiianPizza();
            default -> throw new IllegalArgumentException("Invalid pizza type");
        };
    }
}
```

**Key Points:**
- Private constructor prevents instantiation of the factory class
- Static method `getInstanceOf()` handles object creation
- Uses Java 14+ switch expression for clean conditional logic
- Validates input and throws exceptions for invalid cases
- Returns the interface type, not concrete implementations

### 4. Client Code
Uses the factory to create objects without knowing the concrete implementation details.

```java
public class PizzaShopApp {
    static void main() {
        var pizza = PizzaFactory.getInstanceOf("hawaiian");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza);

        var pepperoni = PizzaFactory.getInstanceOf("pepperoni");
        pepperoni.prepare();
        pepperoni.bake();
        pepperoni.cut();
        pepperoni.box();
        System.out.println(pepperoni);
    }
}
```

## Benefits

1. **Encapsulation**: Object creation logic is centralized in one place
2. **Decoupling**: Client code is decoupled from concrete product classes
3. **Maintainability**: Easy to add new product types without modifying client code
4. **Reusability**: Factory can be reused across the application
5. **Single Responsibility**: Factory class has one responsibility - creating objects

## When to Use

- When you have multiple classes that implement a common interface
- When you want to centralize object creation logic
- When you need to hide complex instantiation logic from clients
- When you want to make it easy to add new types without changing existing code

## Limitations

- **Violates Open/Closed Principle**: Adding new product types requires modifying the factory class
- **Tight Coupling**: Factory is coupled to all concrete product classes
- **Not a Formal Pattern**: Not officially recognized in GoF patterns, but widely used

## Best Practices

1. **Use Interface Types**: Always return the interface type, not concrete classes
2. **Input Validation**: Validate input parameters and handle invalid cases gracefully
3. **Private Constructor**: Make factory constructor private to prevent instantiation
4. **Static Method**: Use static method for factory creation (no need for factory instances)
5. **Clear Naming**: Use descriptive method names like `getInstanceOf()`, `create()`, or `make()`

## Common Pitfalls

1. **Returning Null**: Always return a valid object or throw an exception, never return null
2. **Not Handling Invalid Input**: Always validate input and provide meaningful error messages
3. **Exposing Concrete Types**: Client code should depend on abstractions, not concrete implementations
4. **Overcomplicating**: Keep the factory simple - if it becomes complex, consider Factory Method or Abstract Factory patterns

## Example Output

```
Preparing Hawaiian Pizza
Baking Hawaiian Pizza
Cutting Hawaiian Pizza
Boxing Hawaiian Pizza
com.isaachome.designpattern.simplefactory.pizzashop.HawaiianPizza@...
Preparing Pepperoni Pizza
Baking Pepperoni Pizza
Cutting Pepperoni Pizza
Boxing Pepperoni Pizza
com.isaachome.designpattern.simplefactory.pizzashop.PepperoniPizza@...
```

## Related Patterns

- **Factory Method**: Defines an interface for creating objects but lets subclasses decide which class to instantiate
- **Abstract Factory**: Provides an interface for creating families of related objects without specifying their concrete classes
- **Builder**: Separates the construction of complex objects from their representation
