package behaviors;

public class Quack implements IQuackBehavior {

    @Override
    public void performQuack() {
        System.out.println("Quack");
    }
}
