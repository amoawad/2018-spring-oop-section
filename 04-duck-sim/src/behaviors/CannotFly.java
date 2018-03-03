package behaviors;

public class CannotFly implements IFlyBehavior {
    @Override
    public void performFly() {
        System.out.println("Cannot fly");
    }
}
