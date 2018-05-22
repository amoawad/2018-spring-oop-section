package example5;

public class Counter {

    int count;

    public Counter() {
        count = 0;
    }

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public synchronized int getValue() {
        return count;
    }

}
