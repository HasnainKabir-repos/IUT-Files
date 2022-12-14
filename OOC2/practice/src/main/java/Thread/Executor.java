package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Student(45, "Tamzid", 2500));
        Thread thread2 = new Thread(new Student(47, "Shakkhor", 1000));
        Thread thread3 = new Thread(new Student(50, "Ridun", 1500));

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);

        executorService.shutdown();
    }
}
