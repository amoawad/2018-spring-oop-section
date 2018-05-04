public class SoldOutState extends State {

    public SoldOutState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin() {
        System.out.println("قفلنا النهاردة");
    }

    @Override
    public void ejectCoin() {
        System.out.println("يا عمي احنا قافلين أصلاً");
    }

    @Override
    public void turnCrank() {
        System.out.println("قفلنا النهاردة");
    }

    @Override
    public void dispense() {

    }
}
