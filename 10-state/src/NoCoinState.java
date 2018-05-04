public class NoCoinState extends State {

    public NoCoinState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin accepted!");
        machine.changeState(machine.HAS_COIN);
    }

    @Override
    public void ejectCoin() {
        System.out.println("بطل نصب، مفيش حاجة");
    }

    @Override
    public void turnCrank() {
        System.out.println("ما تستعبطش");
    }

    @Override
    public void dispense() {

    }
}
