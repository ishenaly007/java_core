package multithreading;

public class Notifier implements Runnable {

    private Message message;

    public Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " стартовал " + System.currentTimeMillis());

        try {
            Thread.sleep(1000);
            synchronized (message) {
                message.setMessage("Notify отработал");
                message.notify();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
