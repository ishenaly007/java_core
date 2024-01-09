package multithreading;

public class SleepTest extends Thread {

    public SleepTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Threading by " + Thread.currentThread().getName() + " |i is " + i + "\n");
            try {
                Thread.sleep(1000);//поток уснул просто
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SleepTest sleep1 = new SleepTest("first");
        SleepTest sleep2 = new SleepTest("second");
        SleepTest sleep3 = new SleepTest("thirst");
        SleepTest sleep4 = new SleepTest("four");
        sleep1.start();
        sleep2.start();
        sleep3.start();
        sleep4.start();
    }
}
