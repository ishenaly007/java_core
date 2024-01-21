package multithreading;

public class Waiter extends Thread {
    private final Message message;

    @Override
    public void run() {
        synchronized (message) {
            System.out.println(this.getName() + " Ждем метода notify " + System.currentTimeMillis());
            try {
                message.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName() + " был вызов notify " + System.currentTimeMillis());
            System.out.println(getName() + " : " + message.getMessage());
        }
    }

    public Waiter(String name, Message message) {
        super(name);
        this.message = message;
    }
}
