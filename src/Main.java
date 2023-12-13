import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        /*Car audi = new Car("Black", "Audi A5");
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
        subaru.move(160, 160, 525, 325);*/
        /*String string = "BBB";
        System.out.println(string.concat("AAAAA"));

        int as = 23;

        System.out.println(String.valueOf(as));
        System.out.println(getFormatLogin(" qdqwscceiSSewfwe134 "));
        String str1 = "asa sasss";
        System.out.println(str1.substring(str1.indexOf(" ")));

        System.out.println(replaceSecondWord("dffdfd asasn", "asasa"));
        System.out.println(replaceSecondWord("dffdfd asasn", "asasn"));

        System.out.println(generateMan());
        System.out.println(generateMan());
        System.out.println(generateMan());
        System.out.println(generateMan());*/

        //findMaxLengthStroke();
    }
    /*public static String getFormatLogin(String login) {
        return login.trim().toLowerCase();
    }

    public static String replaceSecondWord(String str1, String str2) {
        String word = str1.substring(str1.indexOf(" ")).trim();
        if (word.equals(str2)) {
            return "бессмысленно заменять";
        } else {
            str1 += str2;
            return str1.trim();
        }
    }

    public static String generateMan() {
        String[] beauty = {"Нига", "Тупой", "Даун", "Красивый", "Успешный", "Бот", "Лошара", "Гении", "Бизнесмен", "Мускулистый", "Быстрый"};
        String[] who = {"Ишеналы", "Тилек", "Жанболот", "Бакыт", "Султан", "Мирлан агай", "Асема", "Алина", "Баели", "Айбек", "Геймер"};
        String[] whatDoes = {"грабит дома", "водит машину", "отдыхает на мальдивах",
                "решает задачи", "играет в шедевробравлстарс", "занимается говном", "плавает с акулами", "лежит на диване",
                "кормит котят", "бомжует",
                "спит как убитый", "врезается в стену и разбивает голову на хрен", "тратит свои миллиады"};
        Random random = new Random();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(beauty[random.nextInt(beauty.length)])
                .append(" ")
                .append(who[random.nextInt(who.length)])
                .append(" ")
                .append(whatDoes[random.nextInt(whatDoes.length)]);
        return stringBuilder.toString();
    }*/

    /*public static void findMaxLengthStroke(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int maxLength = 0;
        String strokeMax = "";

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            if (maxLength < matcher.end() - matcher.start()){
                maxLength = matcher.end() - matcher.start();
                strokeMax = matcher.group();
            }
        }
        System.out.println(maxLength + " " + strokeMax);
    }*/

}