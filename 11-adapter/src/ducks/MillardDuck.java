package ducks;

public class MillardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quaaaack");
    }

    @Override
    public void fly() {
        System.out.println("I believe I can fly!");
    }
}
