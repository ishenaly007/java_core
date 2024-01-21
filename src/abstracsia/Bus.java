package abstracsia;

import abstracsia.interfaces.Transport;

public class Bus extends GroundTransport {

    private final String model = "Audi A4";
    private final String honk = "Ratatata";

    @Override
    public void honk() {
        super.honk();
        System.out.println(honk);
    }

    void honk(boolean b) {
        if (b)
            System.out.println("Уйди с дороги! ");
        else
            System.out.println("Уйди с дороги! ");
    }

    @Override
    void refuel(int liters) {
        System.out.println("Заправился на " + liters + "литров");
    }

    @Override
    public void move(int path) {
        System.out.println("Проехал " + path + "км");
    }

    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Transport bus = new Bus();
        GroundTransport bus2 = new Bus();
        bus.honk();
        //((Bus)bus).refuel(12); //not good
        bus1.refuel(12); //good
        bus2.move(23);

        //System.out.println(bus); //no no
        System.out.println(bus1);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", honk='" + honk + '\'' +
                '}';
    } //zer good)
}
