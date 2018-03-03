import behaviors.FlyWithRocket;
import ducks.*;

public class DuckSimulator {

    public static void main(String[] args){

        Duck duck1 = new MallardDuck();
        Duck duck2 = new RedNeckDuck();
        Duck duck3 = new RubberDuck();
        Duck duck4 = new DecoyDuck();
        Duck duck5 = new RocketDuck();

        playDuck(duck1);
        playDuck(duck2);
        playDuck(duck3);
        playDuck(duck4);
        playDuck(duck5);

        duck4.setFlyBehavior(new FlyWithRocket());

        playDuck(duck4);
    }

    public static void playDuck(Duck duck) {
        duck.quack();
        duck.swim();
        duck.display();
        duck.fly();
        System.out.println("-----------");
    }

}
