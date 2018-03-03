package ducks;

import behaviors.FlyWithWings;
import behaviors.Quack;

public class RedNeckDuck extends Duck {

    public RedNeckDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm red");
    }

}
