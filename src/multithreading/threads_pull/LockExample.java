package multithreading.threads_pull;

import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        CommonResource resource = new CommonResource();
        ReentrantLock locker = new ReentrantLock();
        for (int i = 0; i < 6; i++) {
            Thread t = new Thread(new CountThread(resource, locker));
            t.setName("Thread " + i);
            t.start();
        }
    }
}

class CommonResource {
    int x;
}

class CountThread implements Runnable {
    CommonResource res;
    ReentrantLock lock;

    public CountThread(CommonResource res, ReentrantLock lock) {
        this.res = res;
        this.lock = lock;
    }


    @Override
    public void run() {
        lock.lock();
        try {
            res.x = 1;
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            lock.unlock();
        }
    }
}

