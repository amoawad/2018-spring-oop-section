package example2;

public class Task implements Runnable {

    public void execute() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " will sleep");
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName() + " finished execution");
    }

    @Override
    public void run() {
        try {
            execute();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
