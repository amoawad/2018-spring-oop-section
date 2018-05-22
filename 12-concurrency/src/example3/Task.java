package example3;

public class Task {

    public void execute() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " will sleep");
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName() + " finished execution");
    }

}
