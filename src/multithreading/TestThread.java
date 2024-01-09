package multithreading;

public class TestThread extends Thread {
    //      для чего
    //паралельное выполнение частей кода
    //увеличение производительности
    //разделение программы на независимые части

    //Синхронизация - основная сложность многопоточности
    //один поток изменил значение а, но другой работает с устаревшими данными
    //главный поток Main thread = main, и остальные дочерние
    /*
                3 способа создания потоков
    1 - наследоваться от Thread и переопределить метод run
    2 - реализовать интерфейс Runnable
    3 - с помощью класса реализующего интерфейс Callable
    */

    /*состояние потока можно получить с помощью методов:
        int getState() будет возвращать enum State
        boolean isAlive()
        класса Thread
    */

    public TestThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("ThreadClass run() method " + "Thread name is:" + this.getName());
    }

    public static void main(String[] args) {
        TestThread thread = new TestThread("Поток 1");
        thread.start();
        TestThread thread2 = new TestThread("Поток 2");
        thread2.start();
        TestThread thread3 = new TestThread("Поток 3");
        thread3.start();
        System.out.println(thread3.getState());

        System.out.println("-----------------------------------");

        Message message = new Message("обработать");
        Waiter waiter = new Waiter("waiter", message);
        waiter.start();
        Waiter waiter2 = new Waiter("waiter2", message);
        waiter2.start();

        Notifier notifier = new Notifier(message);
        new Thread(notifier, "notifier").start();
        System.out.println("Стартовали все потоки");
    }
}