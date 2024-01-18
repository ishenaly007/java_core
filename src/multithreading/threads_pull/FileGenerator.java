package multithreading.threads_pull;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FileGenerator implements Callable {
    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        List<String> fileList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            String fileName = "C:/Users/ishenaly/OneDrive/Desktop/asas/" + threadName + " " + i + ".txt";
            fileList.add(fileName);
            try (OutputStream os = new FileOutputStream(fileName);
                 BufferedOutputStream bos = new BufferedOutputStream(os)) {
                bos.write(("Slojno, Neponimayu" + i).getBytes());
                bos.flush();
            }

            System.out.println(threadName + "записал файл" + fileName);
        }
        Thread.sleep(1000);
        return fileList;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<List<String>>> futures = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Callable<List<String>> fileGenerator = new FileGenerator();
            Future<List<String>> future = pool.submit(fileGenerator);
            futures.add(future);
        }

        ArrayList<String> resultList = new ArrayList<>();
        for (Future<List<String>> f : futures) {
            resultList.addAll(f.get());
        }

        System.out.println(resultList);
        pool.shutdown();
    }
}
