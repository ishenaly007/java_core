package multithreading;

public class SyncWithoutObj {
    public static void main(String[] args) {
        final Object object = new Object();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (object) {
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("T1 end!");
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (object) {
                    try {
                        System.out.println("T2 start!");
                        object.notify();
                        System.out.println("T2 end!");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
