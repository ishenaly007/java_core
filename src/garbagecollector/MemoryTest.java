package garbagecollector;

import java.util.ArrayList;

public class MemoryTest {

    public static void main(String[] args) {
        printMemory();
        ArrayList list = new ArrayList<>();
        for (int i = 0; i < 1000_000; i++) {
            list.add(new Man(i));
        }
        printMemory();
    }

    private static void printMemory() {
        System.out.println("Max memory: " + Runtime.getRuntime().maxMemory() / 1000_000);
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory() / 1000_000);
        System.out.println("Free available memory: " + Runtime.getRuntime().freeMemory() / 1000_000);
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Used memory: " + usedMemory / 1000_000);
        long freeMemory = Runtime.getRuntime().maxMemory() - usedMemory;
        System.out.println("Free memory: " + freeMemory / 1000_000);
        System.out.println("-------------------------------------------");
    }
}
