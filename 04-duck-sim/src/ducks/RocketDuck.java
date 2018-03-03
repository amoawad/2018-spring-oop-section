package ducks;

import behaviors.FlyWithRocket;
import behaviors.Quack;

public class RocketDuck extends Duck {

    public RocketDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithRocket();
    }

    @Override
    public void display() {
        System.out.println("I'm freeeeeeee");
    }
}
