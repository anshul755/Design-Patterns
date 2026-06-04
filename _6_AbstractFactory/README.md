# Abstract Factory Pattern

## What it is

Abstract Factory Pattern provides an interface for creating families of related objects without specifying their concrete classes.

## Simple idea

Create related objects together using a factory family.

Instead of creating objects one by one, the factory creates an entire compatible set of objects.

## Real-life example

A GUI application may support:

### Windows Theme

* WindowsButton
* WindowsCheckBox

### Mac Theme

* MacButton
* MacCheckBox

The client only uses the factory interface and gets matching UI components.

## What it solves

* Creation of related object families
* Tight coupling with concrete classes
* Incompatible object combinations
* Scattered object creation logic
* Platform-specific object handling

## Main roles

* `AbstractProduct` → common product interfaces
* `ConcreteProduct` → platform-specific implementations
* `AbstractFactory` → factory interface
* `ConcreteFactory` → creates related product families

## Example use cases

* Cross-platform UI systems
* Theme engines
* Database driver families
* Cloud provider SDKs
* Payment gateway ecosystems

## What to remember

* Abstract Factory creates families of related objects.
* It ensures compatible objects are used together.
* It follows Open/Closed Principle.
* It promotes loose coupling.
* Client depends only on interfaces.

---

# Quick comparison

* Simple Factory = one factory creates objects
* Factory Method = subclasses decide object creation
* Abstract Factory = creates families of related objects
* Strategy = choose behavior
* Observer = notify listeners
* Decorator = add features by wrapping
