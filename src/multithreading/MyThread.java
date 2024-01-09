package multithreading;

public class MyThread extends Thread {
    private int counter = 0;
    static int globalCounter = 0;

    @Override
    public void run() {
        while (counter < 20 & globalCounter < 30) {
            counter++;
            globalCounter++;
            System.out.println(currentThread().getName() + ": Count is" + counter);
            System.out.println(currentThread().getName() + ": Global♥Count is" + globalCounter);
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        myThread1.setName("thread1");
        myThread2.setName("thread2");
        myThread2.setName("thread3");
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}