public class SoldState extends State {

    public SoldState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin() {
        System.out.println("Be patient, I'm serving you a gumball");
    }

    @Override
    public void ejectCoin() {
        System.out.println("متأخر أوي يا علاء");
    }

    @Override
    public void turnCrank() {
        System.out.println("يا ناصح مش هأطلع لك اتنين أنا");
    }

    @Override
    public void dispense() {
        machine.release(1);
    }
}
