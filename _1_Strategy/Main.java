package _1_Strategy;

interface FlyBehavior {
    void fly();
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Flying with wings");
    }
}

class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("Cannot fly");
    }
}

interface QuackBehavior {
    void quack();
}

class NormalQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack Quack");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Silent");
    }
}

abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks swim");
    }

    abstract void display();

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}

class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new NormalQuack();
    }

    void display() {
        System.out.println("I am a Mallard Duck");
    }
}

class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new MuteQuack();
    }

    void display() {
        System.out.println("I am a Rubber Duck");
    }
}

public class Main {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();

        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println();

        Duck rubber = new RubberDuck();

        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        System.out.println();

        rubber.setFlyBehavior(new FlyWithWings());

        rubber.performFly();
    }
}