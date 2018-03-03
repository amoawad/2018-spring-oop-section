package ducks;

import behaviors.FlyWithWings;
import behaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm green");
    }

    public void eat() {
        
    }

}
