package abstracsia;

import abstracsia.interfaces.Transport;

public abstract class GroundTransport implements Transport {
    abstract void refuel(int liters);

    @Override
    public void honk() {
        System.out.println("Bim bam");
    }
}
