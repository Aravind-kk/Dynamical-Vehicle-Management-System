# Dynamica Vehicle Management System- Core Java 

## Description
This project demonstrates concepts of abstraction, inheritance, polymorphism, and encapsulation in Java. It includes classes and interfaces representing vehicles and their operations.

## Classes and Interfaces
### Vehicle (Interface)
- `void engine()`: Abstract method representing the engine operation of a vehicle.
- `void breaks()`: Abstract method representing the brakes operation of a vehicle.

### Bus (Abstract Class)
- Inheriting from `Vehicle`.
- Provides a partial implementation of the `breaks()` method.
- Cannot implement the `engine()` method due to varying implementations across bus types.

### RedBus (Class)
- Extends `Bus`.
- Implements the `engine()` method with a specific capacity.

### Volvo (Class)
- Extends `Bus`.
- Overrides both `engine()` and `breaks()` methods with specific implementations.

### Express (Class)
- Extends `Bus`.
- Overrides both `engine()` and `breaks()` methods with specific implementations.

### Driver (Class)
- Demonstrates loose coupling and runtime polymorphism.
- `drive(Vehicle v)`: Accepts any subtype of `Vehicle` and executes its methods based on runtime object type.

### BusDepoWithReflection (Class)
- Dynamic implementation using reflection API.
- Allows input of vehicle name from the user.
- Dynamically loads and instantiates the specified class, then passes it to the `Driver` for execution.

## Usage
To run `BusDepoWithReflection`, compile the Java files and execute `BusDepoWithReflection` class. Enter the name of the vehicle when prompted.

## Java Compiler 
javac *.java

## Runtime 
java BusDepoWithReflection

## Requirements
Java Development Kit (JDK) installed.
Java compiler ('javac') and runtime ('java') available in the system PATH.



