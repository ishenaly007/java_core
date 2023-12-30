package collections;

import java.time.LocalDate;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addNewUser(new User("misha", "12345", LocalDate.of(2021, 12, 10)));
        manager.addNewUser(new User("alisa", "alissa", LocalDate.now()));
        manager.addNewUser(new User("dmitriy", "capuchino", LocalDate.of(2023, 2, 2)));
        manager.addNewUser(new User("maria", "bruhhh", LocalDate.of(2020, 9, 23)));
        manager.addNewUser(new User("kamila", "umenyanetprav", LocalDate.of(2022, 7, 15)));
        System.out.println();
        manager.login("alisa","alissa");

        manager.getAllUsers("date");
        System.out.println();
        manager.getAllUsers("login");

    }
}
