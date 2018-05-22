package example3;

public class TaskProcessor implements Runnable {

    boolean stopFlag;

    public TaskProcessor() {
        stopFlag = false;
    }

    public void waitAndExecute() throws InterruptedException {
        System.out.println("Waiting and Executing");
        while (!stopFlag) {
            System.out.println("Fetching tasks");
            Task[] tasksList = fetchTasks();
            if(tasksList != null) {
                for(Task task : tasksList) {
                    task.execute();
                }
            }

            System.out.println(Thread.currentThread().getName() + " will sleep");
            Thread.sleep(5000);
        }
    }

    public void stopExecution() {
        stopFlag = true;
    }

    private Task[] fetchTasks() {
        return new Task[] {
                new Task(),
                new Task(),
                new Task(),
                new Task()
        };
    }

    @Override
    public void run() {
        try {
            waitAndExecute();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
