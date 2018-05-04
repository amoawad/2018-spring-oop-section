public class GumballMachine {

    private int count;

    public final State NO_COIN;
    public final State HAS_COIN;
    public final State SOLD;
    public final State SOLD_OUT;
    public final State WINNER;

    private State state;

    public GumballMachine(int count) {
        this.count = count;

        NO_COIN = new NoCoinState(this);
        HAS_COIN = new HasCoinState(this);
        SOLD = new SoldState(this);
        SOLD_OUT = new SoldOutState(this);
        WINNER = new WinnerState(this);

        state = NO_COIN;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    public void release(int num) {
        System.out.println("Here's your gumballs :D - " + num);
        count -= num;
        if(count == 0) {
            changeState(SOLD_OUT);
        } else {
            changeState(NO_COIN);
        }
    }

}
