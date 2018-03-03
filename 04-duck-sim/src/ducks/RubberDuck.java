package ducks;

import behaviors.CannotFly;
import behaviors.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new CannotFly();
    }

    @Override
    public void display() {
        System.out.println("I'm a yellow plastic duck");
    }
}
