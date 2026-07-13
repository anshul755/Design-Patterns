# Facade Pattern

## What it is

Facade Pattern provides a simplified interface to a complex subsystem.

## Simple idea

Hide the complexity of multiple classes behind a single easy-to-use interface.

## Real-life example

When you press the power button on a computer:

* CPU starts
* Memory loads
* Hard Drive reads data
* Operating System boots

You only press one button, while many internal operations happen behind the scenes.

## What it solves

* Complex subsystem interactions
* Too many dependencies between client and subsystem classes
* Difficult-to-use APIs
* Repeated setup logic
* High coupling with internal implementation details

## Main roles

* `Facade` → simplified interface
* `Subsystem Classes` → perform actual work
* `Client` → interacts only with facade

## Example use cases

* Computer startup systems
* Payment processing workflows
* Home theater systems
* Banking transactions
* E-commerce checkout process
* Third-party SDK wrappers

## What to remember

* Facade provides a unified interface to a set of interfaces.
* It hides subsystem complexity.
* Client communicates with only one object.
* It reduces coupling between client and subsystem.
* It improves readability and usability.

---

# Workflow

1. Client calls the facade.
2. Facade coordinates subsystem objects.
3. Subsystems perform actual work.
4. Result is returned to the client.

For your example:

1. Client calls `startComputer()`
2. Facade calls:

   * `cpu.freeze()`
   * `hardDrive.read()`
   * `memory.load()`
   * `cpu.execute()`
3. Computer starts successfully

---

# Advantages

* Simplifies client code
* Reduces coupling
* Hides implementation details
* Easier maintenance
* Improves readability

## Disadvantages

* Facade can become a God Object if it handles too many responsibilities
* May hide useful subsystem functionality

---

# Quick comparison

* Facade = simplify a complex subsystem
* Adapter = make incompatible interfaces work together
* Decorator = add behavior by wrapping
* Command = encapsulate requests as objects
* Strategy = choose behavior
* Observer = notify listeners
* Factory Method = create objects through subclasses
