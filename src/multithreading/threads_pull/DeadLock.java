package multithreading.threads_pull;

public class DeadLock {
    /*
        если 2 потока сразу хотят использовать 1 обьект но обе ждут этот обьект это состояние deadlock
        если наоборот 2 потока заняты отвечанием друг другу не делая свою работу это livelock

        starvation - когда есть 1 жадный поток
        race condition - состояние гонки потоков
    */
    static class Friend {
        private final String name;

        Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s" + " has bowed to me!%n", this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s" + " has bowed back to me!%n", this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        Friend astolfo = new Friend("Astolfo");
        Friend pookie = new Friend("Pookie");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
                astolfo.bow(pookie);
                System.out.println("Th: Pookie bowed to Astolfo");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2");
                pookie.bow(astolfo);
                System.out.println("2: Pookie waiting Astolfo bowed");
            }
        }).start();
    }
}
