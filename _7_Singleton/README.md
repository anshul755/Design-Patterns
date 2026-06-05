# Singleton Pattern

## What it is

Singleton Pattern ensures that only one instance of a class exists and provides a global access point to it.

## Simple idea

Restrict object creation so only one object is created during the application's lifetime.

## Real-life example

A database connection manager should usually have only one shared instance.

Other examples:

* Logger
* Configuration manager
* Cache manager
* Thread pool
* Application settings

## What it solves

* Multiple unnecessary object creation
* Shared resource conflicts
* Global state management
* Memory waste
* Inconsistent application behavior

## Main roles

* `Singleton Class` → controls its own instance creation
* `Private Constructor` → prevents direct object creation
* `Static Instance` → stores single object
* `getInstance()` → provides global access

## Example use cases

* Database connection manager
* Logging system
* Cache system
* Configuration settings
* Runtime environment manager (eg. Java Runtime)

## What to remember

* Singleton allows only one object instance.
* Constructor is private.
* Object is accessed using `getInstance()`.
* It provides global access to a shared resource.
* Often used for centralized management objects.

---

# Important concepts

## Lazy Initialization

Object is created only when needed.

```java
if(databaseConnection == null)
```

## Thread Safety

Using `synchronized` ensures multiple threads do not create multiple objects simultaneously.

```java
public static synchronized DatabaseConnection getInstance()
```

---

# Advantages

* Controlled access to single object
* Saves memory
* Shared resource management
* Global access point

## Disadvantages

* Global state can make testing difficult
* Can violate Single Responsibility Principle
* Overuse may create tight coupling

---

# Quick comparison

* Singleton = only one object instance
* Simple Factory = centralized object creation
* Factory Method = subclasses decide object creation
* Abstract Factory = creates related object families
* Strategy = choose behavior
* Observer = notify listeners
* Decorator = add features by wrapping
