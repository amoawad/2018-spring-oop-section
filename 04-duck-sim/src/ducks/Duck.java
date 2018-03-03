package ducks;

import behaviors.IFlyBehavior;
import behaviors.IQuackBehavior;

public abstract class Duck {

    IQuackBehavior quackBehavior;
    IFlyBehavior flyBehavior;

    public void quack() {
        quackBehavior.performQuack();
    }

    public void fly() {
        flyBehavior.performFly();
    }

    public void swim() {
        System.out.println("Swim");
    }

    public abstract void display();

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

}
