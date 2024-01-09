package multithreading;

public class JoinThreadTest extends Thread{
    public JoinThreadTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + " is running " + i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.getName() + " completed!!!");
    }

    public static void main(String[] args) {
        JoinThreadTest threadA = new JoinThreadTest("A");
        JoinThreadTest threadB = new JoinThreadTest("B");
        JoinThreadTest threadC = new JoinThreadTest("C");

        threadA.start();
        try {
            threadA.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadB.start();
        threadC.start();
    }
}
