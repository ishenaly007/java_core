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
        manager.login("alisa", "alissa");

        manager.getAllUsers("date");
        System.out.println();
        manager.getAllUsers("login");
        manager.getAllUsers();
        manager.editUser(new User("alisa", "323232", LocalDate.now()));
        manager.getAllUsers("date");

        //рефлективность a = a
        //симметричность a = b | b = a
        //транзитивность a = b | b = c | значит c | a
        //согласованность повторный вызов equals через время должно вернуть true
        //сравнение null: a.equals(null) == false | xNullPointerException
        // public native int hashCode();  native = реализован нативным образом на языке С++ на дистрибутиве джава
        //как реализован hashCode в самом джава даже если мы переписали его? System.identityHashCode(main);
        //Objects.equals(asas, a.asas2) return false xNullPointerException
        //asas.equals(a.asas2) if 0 = NullPointerException
        /*
        Map<String, Integer> hashMap = new HashMap<>();
        когда создается:
        table(Buckets) = хранилище где хранятся ключ-значения( размен по умолчанию 16)
        loadFactor = 0.75(75% от максимального значения(capacity)
        threshold = (capacity * loadFactor) = 16 * 0.75 = [12]
        можно это изменять: new HashMap<>(16, 0.75f);
        */

    }
}
