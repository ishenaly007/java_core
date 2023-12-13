package abstracsia.interfaces;

public interface Transport {
    String transportType = "ДВС";

    void move(int path);

    default void honk(){
        System.out.println("Bi bip");
    };
}
