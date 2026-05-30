# Strategy Pattern

## What it is

Strategy Pattern lets you define a family of algorithms, place each one in a separate class, and make them interchangeable.

## Simple idea

Instead of writing behavior directly inside a class, you move that behavior into separate strategy classes.

## Real-life example

A navigation app can choose between:

* Car route
* Walking route
* Bike route

The app stays the same, but the routing behavior changes.

## What it solves

* Large `if-else` or `switch` blocks
* Behavior duplication
* Wrong use of inheritance
* Runtime behavior changes
* Tight coupling between object and behavior

## Main roles

* `Context` → holds a strategy object
* `Strategy` → interface for behavior
* `ConcreteStrategy` → actual behavior implementation

## Example use cases

* Payment methods
* Sorting algorithms
* Compression algorithms
* Duck flying and quacking behaviors

## What to remember

* Strategy is about choosing one behavior from many.
* It uses composition.
* It helps when behavior changes independently of the object.
