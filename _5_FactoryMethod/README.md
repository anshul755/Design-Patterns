# Factory Method Pattern

## What it is

Factory Method Pattern defines an interface for creating objects, but lets **subclasses decide which class to instantiate**.

## Simple idea

Do not let client code create objects directly.
Let a superclass define the creation process, and let subclasses choose the actual product.

## Real-life example

A vehicle creator may have different factories:

* CarFactory → creates Car
* BikeFactory → creates Bike
* TruckFactory → creates Truck

The client works with the factory abstraction, not the concrete class.

## What it solves

* Tight coupling with concrete classes
* Hardcoded object creation
* Scattered creation logic
* Difficulty extending creation logic
* Need for flexible object creation

## Main roles

* `Product` → common interface
* `ConcreteProduct` → real implementation
* `Creator` → declares factory method
* `ConcreteCreator` → overrides factory method and creates product

## Example use cases

* Document creation systems
* UI framework widgets
* Notification handlers
* Export/import file creators
* Payment gateway creation

## What to remember

* Factory Method is about **delegating object creation to subclasses**
* It reduces direct dependency on concrete classes
* It follows **Open/Closed Principle**
* It supports **loose coupling**
* The creator can contain common workflow logic

---

# Quick comparison

* Simple Factory = one class decides what to create
* Factory Method = subclasses decide what to create
* Strategy = choose behavior
* Observer = notify listeners
* Decorator = add features by wrapping
