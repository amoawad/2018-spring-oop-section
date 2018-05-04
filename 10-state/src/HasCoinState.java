import java.util.Random;

public class HasCoinState extends State {

    public HasCoinState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin() {
        System.out.println("Already inserted coin");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Here's you coin, I'm sad");
    }

    @Override
    public void turnCrank() {
        System.out.println("I'm gonna serve you one");
        Random random = new Random();
        boolean isWinner = random.nextBoolean();
        if(isWinner) {
            machine.changeState(machine.WINNER);
        } else {
            machine.changeState(machine.SOLD);
        }

        machine.dispense();
    }

    @Override
    public void dispense() {
    }
}
