package nasledovanie;

public class Bus extends GroundTransport {
    @Override
    void honk() {
        System.out.println("Уйди с дороги! ");
    }

    void honk(boolean b) {
        if (b)
            System.out.println("Уйди с дороги! ");
        else
            System.out.println("Уйди с дороги! ");
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.honk();
        bus.honk("Дзынь");
        bus.honk("Боинк", 3);
    }
}
