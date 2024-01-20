package singleton;

public class Singleton {

    private static Singleton instance;
    private static volatile Singleton instance2;//многопоточного программы(реализации)
    public String value;

    private Singleton() {
    }

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance() {//инициализация в начале проекта
        return instance;
    }

    public static Singleton getInstance2() {//отложенная инициализация
        //инициализация при первом вызове
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance(String value) {//отложенная инициализация
        //инициализация при первом вызове
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    //Double Check Lock
    //многопоточного программы(реализации)
    public static Singleton getInstance3() {
        if (instance2 == null) {
            synchronized (Singleton.class) {
                if (instance2 == null) {
                    instance2 = new Singleton();
                }
            }
        }
        return instance2;
    }

}
