import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*String myJavaCore;
        final int NUM = 12;
        String word = "New World";
        myJavaCore = NUM + word;

        System.out.println(myJavaCore + " " + NUM + " " + word);

        if (NUM < 0) System.out.println("Вы сохранили отрицательное число");
        else if (NUM > 0) System.out.println("Вы сохранили положительное число");
        else System.out.println("Вы сохранили ноль");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String username = scanner.nextLine();

        System.out.println("Привет, " + username + "!");*/
        /*int[] array = new int[10];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int max = 0;
        for (int element : array) {
            if (max < element) {
                max = element;
            }
        }
        System.out.println(max);

        int min = 1000;
        for (int element : array) {
            if (min > element) {
                min = element;
            }
        }
        System.out.println(min);

        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        System.out.println(sum);

        int[][] bigArray = new int[3][3];
        for (int i = 0; i < bigArray.length; i++){
            for (int j = 0; j < bigArray[i].length; j++) {
                bigArray[i][j] = random.nextInt(21);
                System.out.print(bigArray[i][j] + " ");
            }
        }*/
        Car audi = new Car("Black", "Audi A5");
        audi.maxFuel = 45;
        audi.fuel = 41;
        audi.fuelConsumption = 7.33;

        audi.move(12, 12, 125, 140);

        Car subaru = new Car("Black", "Subaru");
        subaru.maxFuel = 60;
        subaru.fuel = 60;
        subaru.fuelConsumption = 12;

        subaru.move(12, 12, 525, 325);
        subaru.reFuel(50);
        subaru.move(160, 160, 525, 325);
    }
}