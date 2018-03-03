package ducks;

import behaviors.CannotFly;
import behaviors.Mute;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new Mute();
        flyBehavior = new CannotFly();
    }

    @Override
    public void display() {
        System.out.println("I'm a wooden duck");
    }
}
