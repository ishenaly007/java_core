package nasledovanie;

public class Transport {
    void honk(){
        System.out.println("Bi-bip");
    }

    void honk(String msg){
        System.out.println(msg);
    }

    void honk(String msg, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }
    }
}
