package enums;

public class Pair<T, V> {
    private T key;
    private V value;

    public Pair(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        Pair<Days, Integer>[] massive = new Pair[5];
        massive[0] = new Pair<>(Days.MONDAY, 6);
        massive[1] = new Pair<>(Days.TUESDAY, 5);
        massive[2] = new Pair<>(Days.WEDNESDAY, 3);
        massive[3] = new Pair<>(Days.THURSDAY, 7);
        massive[4] = new Pair<>(Days.FRIDAY, 8);

        for (Pair p : massive) {
            System.out.println(p.key + " отработано часов: " + p.value + " норма часов: " + ((Days) p.key).getWorkingHours());
        }
    }
}
