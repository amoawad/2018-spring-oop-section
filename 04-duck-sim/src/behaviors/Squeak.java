package behaviors;

public class Squeak implements IQuackBehavior {

    @Override
    public void performQuack() {
        System.out.println("Squeak");
    }
}
