package multithreading;

public class TestRunnable implements Runnable {

    /*свойства потока:
        id айди
        name имя
        daemon фоновый ли поток, оно всегда работает
        priority приоритет, но не гарантирует первое выполнение, ими управляет менеджер потоков
    */
    private String name;

    public TestRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("run() " + name + " running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new TestRunnable("10"));
        Thread thread1 = new Thread(new TestRunnable("11"));
        Thread thread2 = new Thread(new TestRunnable("12"));
        Thread thread3 = new Thread(new TestRunnable("13"));
        thread.start();
        thread1.setPriority(Thread.MAX_PRIORITY);//по умолчанию у них 5
        thread1.start();
        thread2.start();
        thread2.setPriority(3);
        thread3.start();
    }
}
