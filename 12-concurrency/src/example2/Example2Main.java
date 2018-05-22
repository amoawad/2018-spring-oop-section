package example2;

public class Example2Main {

    public static void main(String[] args) throws InterruptedException {

        Task t1 = new Task();
        Task t2 = new Task();
        Task t3 = new Task();
        Task t4 = new Task();

        Thread th1 = new Thread(t1, "T1");
        Thread th2 = new Thread(t2, "T2");
        Thread th3 = new Thread(t3, "T3");
        Thread th4 = new Thread(t4, "T4");

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }

}
