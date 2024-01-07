package inputoutput;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class FilesGenerator {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:/Users/ishenaly/OneDrive/Desktop/Susie");
        dir.mkdirs();
        for (int i = 0; i < 12; i++) {
            File file = new File(dir, "test_" + i + ".txt");
            file.createNewFile();
            try (OutputStream os = new FileOutputStream(file);
                 BufferedOutputStream bos = new BufferedOutputStream(os)
            ) {
                bos.write(("Java" + i).getBytes());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        for (File f : dir.listFiles()) {
            try (FileReader fr = new FileReader(f);
                 Scanner sc = new Scanner(fr)) {
                while (sc.hasNext()) {
                    if (sc.next().equals("Java5")) {
                        System.out.println("I find it man!! Yea!!!!! " + f.getName());
                    }
                }
            }
        }

        //-------------------------------------------
        /*for (File f : dir.listFiles()) {
            FileWriter writer = new FileWriter(f, true);//f если перезаписовать\ t если дописывать
            String word = " Hi eervreJonny!";
            //writer.write() написать/записывать
            writer.write(word);//добавить
            writer.flush();//в конце вызвать, хз чё это
            Reader reader = new FileReader(f);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);//дает char по 1му символу
            }
            //System.out.println(f.getPath());//путь до файла дает
        }*/
        try (FileReader reader = new FileReader(dir.listFiles()[0]);
             FileInputStream fis = new FileInputStream(dir.listFiles()[1]);
             FileOutputStream fos = new FileOutputStream("C:/Users/ishenaly/OneDrive/Desktop/copy_of_test.txt")
        ) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);//дает char по 1му символу
            }
            /*char[] buf = new char[256];
            while ((c = reader.read(buf)) > 0) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.println(buf);
            }*/
        } catch (NullPointerException nullEx) {
            System.out.println(nullEx.getMessage());
        }
        File filess = new File("C:/Users/ishenaly/OneDrive/Desktop/copy_of_test.txt");
        Scanner scanner = new Scanner(filess);
        String s = scanner.nextLine();//next() до первого пробела
        System.out.println();
        System.out.println("It's there a " + s);

        TestHouse house = new TestHouse("Toktogula", "Asan", 250);
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("C:/Users/ishenaly/OneDrive/Desktop/serializable_test.txt"));
             ObjectInputStream ios = new ObjectInputStream(
                     new FileInputStream("C:/Users/ishenaly/OneDrive/Desktop/serializable_test.txt"))
        ) {
            oos.writeObject(house);
            TestHouse house1 = (TestHouse) ios.readObject();
            System.out.println(house1.getNumber() + " " + house1.getAddress());
            System.out.println(house.equals(house1));
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage() + " this error");
        }
    }
}