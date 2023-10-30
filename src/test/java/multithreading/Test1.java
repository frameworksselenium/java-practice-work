package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        try {
            int threadcount = 10;
            ExecutorService multiThreadExecutor = Executors.newFixedThreadPool(threadcount);
            for (int i = 0; i < 100; i++) {
                ParallelExecutor1 parallelExecutor = new ParallelExecutor1("Local", "Chrome");
                multiThreadExecutor.submit(parallelExecutor);
            }
            multiThreadExecutor.shutdown();
            multiThreadExecutor.awaitTermination(24, TimeUnit.HOURS);
        }catch(Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}
