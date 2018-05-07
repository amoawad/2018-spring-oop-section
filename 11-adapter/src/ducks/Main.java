package ducks;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.run();

    }

    private void run() {
        Duck duck = new MillardDuck();

        Turkey turkey = new Turkey();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        testDuck(duck);
        testDuck(turkeyAdapter);
    }

    private void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
