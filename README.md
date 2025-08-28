# Design-Pattern
This contains all the design pattern explanations

#factory design pattern

The Factory Design Pattern is a creational design pattern that provides an interface (or method) for creating objects, but allows subclasses or separate methods to decide which specific class (object type) to instantiate. 
It provides a way to create objects without exposing the object creation logic to the client, and instead delegate the responsibility of instantiation to a separate method (factory method/class).
**Instead of creating objects with new one delegates the responsibility to the factory method.** -> you ask a factory to give you an object.
This helps in decoupling object creation from its usage.

Real world analogy -> when you want a car -> we dont build the car -> we select the type of car we need(Sedan or Suv) -> the factory decides how to create the car and is given to us -> we just use the car.

*Factory Method Pattern (GoF Official)*
Defines an interface for creating an object, but lets subclasses decide which class to instantiate. -> Creation logic is in subclasses.



