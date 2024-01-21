package time_baby.practice;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableTestTime implements Callable {

    private final LocalDateTime eventDate;

    public CallableTestTime(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String call() throws Exception {
        long d = 0;
        while ((d = Duration.between(LocalDateTime.now(), eventDate).toSeconds()) >= 0) {
            System.out.println("Event " + Thread.currentThread().getName() + "will be started in " + d);
            Thread.sleep(1000);
        }
        return "Event " + Thread.currentThread().getName() + " started";
    }

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        ExecutorService pool = Executors.newFixedThreadPool(10);

        List<Future<String>> futures = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            LocalDateTime targetTime = dateTime.plusSeconds(5 * i);
            Callable<String> callable = new CallableTestTime(targetTime);
            Future<String> future = pool.submit(callable);
            futures.add(future);
        }

        for (Future<String> future : futures) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        pool.shutdown();
    }

}
