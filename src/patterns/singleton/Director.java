package patterns.singleton;

public class Director {
    private static volatile Director instance;
    private final String name;

    private Director(String name) {
        this.name = name;
    }

    public void sign() {
        System.out.println(name + " стал директором!");
    }

    public static Director getInstance(String name) {
        if (instance == null) {
            synchronized (Director.class) {
                if (instance == null)
                    instance = new Director(name);
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                Director director2 = Director.getInstance("Tilek");
                director2.sign();
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                Director director = Director.getInstance("Ishenaly");
                director.sign();
            }
        }.start();
    }
}
