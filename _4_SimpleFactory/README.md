# Simply Factory Pattern

## What it is

Simple Factory Pattern defines an interface for creating objects, but lets factory classes decide which class to instantiate.

## Simple idea

Do not create objects directly everywhere. Use a factory to hide creation logic.

## Real-life example

A vehicle factory may create:

* Car
* Bike
* Truck

The client only asks for a vehicle.

## What it solves

* Direct dependency on concrete classes
* Scattered object creation logic
* Complex creation rules
* Difficulty adding new product types

## Main roles

* `Product` → common interface
* `ConcreteProduct` → real implementation
* `Factory` → creates product objects

## Example use cases

* Notification creation
* Payment object creation
* UI widgets
* Database drivers
* Loggers

## What to remember

* Simple Factory is about object creation.
* It centralizes construction logic.
* It reduces direct dependency on concrete classes.

---

# Quick comparison

* Strategy = choose behavior
* Observer = notify listeners
* Decorator = add features by wrapping
* Simple Factory = create objects through a factory
