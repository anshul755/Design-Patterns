# Adapter Pattern

## What it is

Adapter Pattern allows incompatible interfaces to work together by converting one interface into another that the client expects.

## Simple idea

Wrap an existing class with an adapter so that it can be used through a different interface.

## Real-life example

A laptop has a USB-C port, but your mouse uses a USB-A connector.

The adapter converts:

* USB-A → USB-C

so both can work together without changing either device.

## What it solves

* Incompatible interfaces
* Legacy system integration
* Third-party library integration
* Reusing existing classes without modification
* Interface mismatch between components

## Main roles

* `Target` → interface expected by the client
* `Adapter` → converts requests between interfaces
* `Adaptee` → existing class with incompatible interface
* `Client` → uses the Target interface

## Example use cases

* Payment gateway integration
* Legacy system migration
* Database driver adapters
* External API integration
* Hardware connectors (USB adapters)

## What to remember

* Adapter makes incompatible interfaces compatible.
* It acts as a translator between two interfaces.
* Client communicates only with the Target interface.
* Existing code can be reused without modification.
* Follows Open/Closed Principle.

---

# Workflow

1. Client expects a `Target`.
2. Adapter implements the `Target`.
3. Adapter contains an `Adaptee`.
4. Client calls the Target method.
5. Adapter converts the call.
6. Adaptee performs the actual work.

---

# Advantages

* Reuses existing code
* Promotes loose coupling
* Easy integration of third-party libraries
* No modification of existing classes

## Disadvantages

* Adds extra layer of abstraction
* Can increase complexity if overused

---

# Quick comparison

* Adapter = make incompatible interfaces work together
* Decorator = add behavior by wrapping
* Facade = simplify a complex subsystem
* Command = encapsulate requests as objects
* Strategy = choose behavior
* Observer = notify listeners
