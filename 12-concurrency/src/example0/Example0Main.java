package example0;

public class Example0Main {

    public static void main(String[] args) {

        Thread t1 = new Thread("T1") {
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        };

        Thread t2 = new Thread("T2") {
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        };

        t1.start();
        t2.start();

    }

}
