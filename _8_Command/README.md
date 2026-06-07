# Command Pattern

## What it is

Command Pattern converts a request into an object, allowing requests to be parameterized, queued, logged, and executed later.

## Simple idea

Encapsulate an action inside a command object.

Instead of directly calling methods, the client sends command objects to an invoker.

## Real-life example

A remote control may support:

* Turn Light ON
* Turn Light OFF
* Increase Fan Speed
* Open Garage Door

Each button action is represented as a command object.

## What it solves

* Tight coupling between sender and receiver
* Hardcoded method calls
* Difficulty adding new operations
* Undo/redo functionality
* Request queuing and scheduling

## Main roles

* `Command` → command interface
* `ConcreteCommand` → implements actual request
* `Receiver` → performs real work
* `Invoker` → triggers commands
* `Client` → creates and connects objects

## Example use cases

* Remote control systems
* GUI button actions
* Undo/redo systems
* Task queues
* Menu actions
* Transaction processing

## What to remember

* Command Pattern encapsulates requests as objects.
* It decouples sender from receiver.
* Invoker does not know actual business logic.
* Commands can be queued, logged, or undone.
* New commands can be added without modifying existing code.

---

# Workflow

1. Client creates receiver object.
2. Client creates command object with receiver.
3. Invoker stores command.
4. Invoker executes command.
5. Receiver performs actual action.

---

# Advantages

* Loose coupling
* Easy extensibility
* Supports undo/redo
* Supports delayed execution
* Supports macro commands

## Disadvantages

* Increases number of classes
* Adds extra abstraction

---

# Quick comparison

* Command = encapsulate requests as objects
* Strategy = choose behavior
* Observer = notify listeners
* Decorator = add features by wrapping
* Singleton = only one object instance
* Factory Method = subclasses decide object creation
