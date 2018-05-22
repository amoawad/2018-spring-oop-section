package example3;

public class Example4Main {

    public static void main(String[] args) throws InterruptedException {

        TaskProcessor processor = new TaskProcessor();

        Thread thread = new Thread(processor, "BusyWaitingThread");
        thread.start();

        System.out.println("-- After wait and execute");

        Thread.sleep(10_000);
        processor.stopExecution();
    }

}
