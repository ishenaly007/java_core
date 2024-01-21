package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsTesting {
    public static void main(String[] args) {
        fileReader();
    }

    public static void fileReader() {
        String fileName = "C:/Users/ishenaly/OneDrive/Desktop/Maintest.txt";
        try {
            BufferedReader readFile = new BufferedReader
                    (new FileReader(fileName));
            String line;
            while ((line = readFile.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            //System.out.println(e.getMessage());
            throw new MyException("путь неверно указан!!", fileName);
        }
    }
}
