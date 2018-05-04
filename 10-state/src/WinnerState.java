public class WinnerState extends State {

    public WinnerState(GumballMachine machine) {
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
        System.out.println("******** TADA *********");
        machine.release(2);
    }
}
