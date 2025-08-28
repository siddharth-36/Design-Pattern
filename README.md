# Design-Pattern
This contains all the design pattern explanations

#factory design pattern

The Factory Design Pattern is a creational design pattern that provides an interface (or method) for creating objects, but allows subclasses or separate methods to decide which specific class (object type) to instantiate. 
It provides a way to create objects without exposing the object creation logic to the client, and instead delegate the responsibility of instantiation to a separate method (factory method/class).

**Instead of creating objects with new one delegates the responsibility to the factory method.** -> you ask a factory to give you an object.
This helps in decoupling object creation from its usage.

Real world analogy -> when you want a car -> we dont build the car -> we select the type of car we need(Sedan or Suv) -> the factory decides how to create the car and is given to us -> we just use the car.

**Factory Method Pattern (GoF Official)**
Defines an interface for creating an object, but lets subclasses decide which class to instantiate. -> Creation logic is in subclasses.

**Best Practices**
Use interfaces or abstract classes for products.
Keep factories in charge of object creation only, not business logic.
Use it with Dependency Injection for cleaner architecture.
Consider combining with Singleton for factories that should have only one instance.

**Factory vs Other Creational Patterns**
Factory Method → Creates objects via subclassing.
Abstract Factory → Creates families of related objects.
Builder → Creates complex objects step by step.
Prototype → Clones existing objects.
Singleton → Ensures only one instance.

**The Factory Design Pattern is about delegating object creation to a separate entity (factory), helping you write flexible, maintainable, and loosely coupled code.**

**Abstract Factory Design**

The Abstract Factory Pattern is a creational design pattern (GoF). -> It provides an interface to create families of related or dependent objects without specifying their concrete classes.
It’s basically a factory of factories. -> If the Factory Method creates one type of object, the Abstract Factory creates related groups of objects.

Real world analogy  -> ferari creates racing cars(f1,f2,f3) and rangerover creates suv cars(s1,s2,s3) -> You don’t pick individual classes; you just pick the factory, and it gives you the matching set.

**When to Use Abstract Factory**
You need to create families of related objects (e.g., GUI components for different OS).
You want to ensure consistency across products (all objects from the same family should match).
You want to hide concrete classes from the client completely.



