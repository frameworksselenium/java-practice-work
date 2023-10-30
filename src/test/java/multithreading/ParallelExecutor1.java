package multithreading;

public class ParallelExecutor1 implements Runnable {

    private String executionType = null;
    private String browser = null;

    public ParallelExecutor1(String executionType, String browser) {
        this.executionType = executionType;
        this.browser = browser;
    }

    @Override
    public void run() {
        System.out.println("Thread ID is : " + Thread.currentThread().getId());
    }
}
