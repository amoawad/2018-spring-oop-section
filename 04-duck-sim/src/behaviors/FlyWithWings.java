package behaviors;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void performFly() {
        System.out.println("I can fly with wings");
    }
}
