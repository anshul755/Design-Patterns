# Decorator Pattern

## What it is

Decorator Pattern lets you add new behavior to an object dynamically without changing its original class.

## Simple idea

You wrap an object inside another object to extend its features.

## Real-life example

A coffee order:

* Simple coffee
* Add milk
* Add sugar
* Add whipped cream

Each topping acts like a decorator.

## What it solves

* Class explosion from many combinations
* Need for dynamic feature addition
* Large inheritance trees
* Extension without modifying existing code

## Main roles

* `Component` → common interface
* `ConcreteComponent` → base object
* `Decorator` → wraps component
* `ConcreteDecorator` → adds extra features

## Example use cases

* Java I/O streams
* Text formatting
* UI borders and scroll bars
* Food add-ons
* Logging wrappers

## What to remember

* Decorator is about adding responsibilities.
* It uses wrapping instead of subclass explosion.
* It is ideal when features need to be combined flexibly.
---

# Quick comparison

* Strategy = choose behavior
* Observer = notify listeners
* Decorator = add features by wrapping