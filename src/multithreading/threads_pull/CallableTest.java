package multithreading.threads_pull;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.*;

public class CallableTest implements Callable {

    private String name;

    public CallableTest(String name) {
        this.name = name;
    }


    @Override
    public Integer call() {
        System.out.println(Thread.currentThread().getName() + " длина слова" + name.length());
        return Integer.valueOf(name.length());
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);//вводим слова в консоль
        String[] strs = sc.nextLine().split(" ");//сохраняем в массив разделяя через пробел

        ExecutorService pool = Executors.newFixedThreadPool(10);//создаем пул потоков
        Set<Future<Integer>> set = new HashSet<>();//создаем чтобы хранить конечные возвращенные результаты

        for (String str : strs) {
            Callable<Integer> callable = new CallableTest(str);//передаем по обьекту и создаем колейбл
            Future<Integer> future = pool.submit(callable);//передаем каждый обьект колейбл сюда
            set.add(future);//добавляем возращенный результат
        }
        int sum = 0;
        for (Future<Integer> future : set) {
            sum += future.get();
        }
        System.out.println("The sum of the lengths is: " + sum);
        pool.shutdown();
    }
}
