# Observer Pattern

## What it is

Observer Pattern defines a one-to-many relationship so that when one object changes state, all dependent objects are notified automatically.

## Simple idea

One object becomes the source of truth, and many other objects listen for updates.

## Real-life example

* YouTube channel and subscribers
* Weather station and displays
* Stock price and investors

## What it solves

* Manual notification logic
* Tight coupling between publisher and subscribers
* Dynamic subscribe and unsubscribe handling
* Event-driven updates

## Main roles

* `Subject` → publisher or observable
* `Observer` → listener
* `ConcreteSubject` → stores state and notifies
* `ConcreteObserver` → reacts to updates

## Example use cases

* Event systems
* GUI listeners
* Notification services
* Pub/Sub systems
* Live dashboards

## What to remember

* Observer is about notifications.
* It is useful when many objects must react to one state change.
* It keeps publisher and subscribers loosely coupled.
---

# Quick comparison

* Strategy = choose behavior
* Observer = notify listeners
