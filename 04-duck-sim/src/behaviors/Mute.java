package behaviors;

public class Mute implements IQuackBehavior {

    @Override
    public void performQuack() {
        System.out.println("Mute");
    }
}
