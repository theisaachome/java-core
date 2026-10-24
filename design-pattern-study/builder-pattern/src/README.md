# Builder Design Pattern

## Overview

The Builder pattern is a creational design pattern that lets you construct complex objects step by step. It allows you to produce different types and representations of an object using the same construction process.

## When to Use

- **Complex objects with many parameters** - When an object has numerous constructor parameters, especially with optional ones
- **Objects requiring construction logic** - When construction involves calculations or transformations (e.g., calculating age from birthday)
- **Multiple representations** - When you need different representations of the same object (e.g., Web DTO, JSON DTO, XML DTO)
- **Immutable objects** - When you want to create immutable objects with a clean construction process

## Pattern Structure

```
Product (User) → Builder Interface (UserDTOBuilder) → Concrete Builder (UserWebDTOBuilder) → Final Product (UserWebDTO)
```

### Components

1. **Product** - The complex object to be built (`User`, `UserDTO`)
2. **Builder Interface** - Defines the construction steps (`UserDTOBuilder`)
3. **Concrete Builder** - Implements the construction steps (`UserWebDTOBuilder`)
4. **Director** - Orchestrates the construction process (`Client`)
5. **Final Product** - The resulting object (`UserWebDTO`)

## Implementation Details

### Product (User)
The source object containing the data to be transformed:
- `firstName` - User's first name
- `lastName` - User's last name
- `birthday` - User's birth date
- `address` - User's address object

### Builder Interface (UserDTOBuilder)
Defines the construction steps with fluent interface:
- `withFirstName(String fname)` - Set first name
- `withLastName(String lname)` - Set last name
- `withBirthday(LocalDate date)` - Set birthday and calculate age
- `withAddress(Address address)` - Set and format address
- `build()` - Assemble the final product
- `getUserDTO()` - Retrieve the built object

### Concrete Builder (UserWebDTOBuilder)
Implements the construction logic:
- Calculates age from birthday using `Period.between()`
- Formats address by combining house number, street, and city
- Returns `this` for method chaining (fluent interface)

### Director (Client)
Orchestrates the construction:
```java
private static UserDTO directBuild(UserDTOBuilder builder, User user) {
    builder.withFirstName(user.getFirstName())
           .withLastName(user.getLastName())
           .withBirthday(user.getBirthday())
           .withAddress(user.getAddress());
    return builder.build();
}
```

## Key Principles

1. **Fluent Interface** - Builder methods return `this` for method chaining
2. **Separation of Concerns** - Construction logic separated from the product
3. **Interface-based Design** - Use interfaces for flexibility and testability
4. **Immutable Final Product** - Products are constructed once and not modified
5. **Step-by-step Construction** - Build complex objects incrementally

## Benefits

- **Readable code** - Fluent interface makes construction code self-documenting
- **Flexible** - Easy to add new builders for different representations
- **Reusable** - Same construction process can create different products
- **Encapsulated complexity** - Construction logic hidden from client
- **Immutable objects** - Prevents inconsistent state

## Example Usage

```java
// Create source user
User user = new User();
user.setFirstName("Ron");
user.setLastName("Swanson");
user.setBirthday(LocalDate.of(1960, 5, 6));
// ... set address

// Build DTO using builder
UserDTOBuilder builder = new UserWebDTOBuilder();
UserDTO dto = builder.withFirstName(user.getFirstName())
                     .withLastName(user.getLastName())
                     .withBirthday(user.getBirthday())
                     .withAddress(user.getAddress())
                     .build();
```

## Extending the Pattern

To add a new representation (e.g., JSON DTO):

1. Create new product class implementing `UserDTO`
2. Create new concrete builder implementing `UserDTOBuilder`
3. Use the same director logic to construct it

Example:
```java
public class UserJSONDTOBuilder implements UserDTOBuilder {
    // Implementation for JSON representation
}
```

## Related Patterns

- **Abstract Factory** - Similar but focuses on families of related objects
- **Factory Method** - Creates objects in one step, Builder is multi-step
- **Prototype** - Clones existing objects, Builder constructs from scratch
