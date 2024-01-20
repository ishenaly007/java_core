package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LambdaTest {

    private static HowYears howYearsOld(Man man) {
        if (man.getAge() >= 18) return man1 -> man1.getName() + " взрослый, можно тащить в армию";
        else return man1 -> man1.getName() + " тц, маленький еще, не повезло";
    }

    private static int sum(int[] nums, Expression func) {
        int result = 0;
        for (int num : nums) {
            if (func.isEqualExp(num)) {
                result += num;
            }
        }
        return result;
    }

    private static Operation<Integer> action(int num) {
        return switch (num) {
            case 1 -> (x, y) -> x + y;
            case 2 -> (x, y) -> x - y;
            case 3 -> (x, y) -> x / y;
            case 4 -> (x, y) -> x * y;
            default -> (x, y) -> 0;
        };
    }

    private static ListWork action(List<Integer> list) {
        if (list.size() > 20) {
            ListWork<Integer, List<Integer>> operation = l -> {
                int max = 0;
                for (int i : l) {
                    max += i;
                }
                return max;
            };
            return operation;
        } else if (list.size() > 10) {
            ListWork<String, List<Integer>> operation = l -> {
                String result = "";
                for (int i : l) {
                    result += String.valueOf(i);
                }
                return result;
            };
            return operation;
        } else {
            ListWork<Integer, List<Integer>> operation = l -> {
                int max = 1;
                for (int i : l) {
                    max *= i;
                }
                return max;
            };
            return operation;
        }
    }

    public static void main(String[] args) {
        System.out.println(howYearsOld(new Man("Ishenaly", 17)).sus(new Man("Ishenaly", 17)));
        System.out.println(howYearsOld(new Man("Tilek", 18)).sus(new Man("Tilek", 18)));
        System.out.println("-----------------------------");
        Operationable<Integer> operation = (x, y) -> x + y;
        int result = operation.calculate(10, 21);

        System.out.println(result);
        Operationable<String> operation2 = (x, y) -> x + y;
        String result2 = operation2.calculate("144", "21");
        System.out.println(result2);

        /*Runnable runnable = () -> System.out.println("ffd");
        new Thread(runnable).start();*/

        String[] mas1 = {"asas", "asas", "asasa", "asasa", "aaaxax"};
        String[] mas2 = {"asas", "asas", "asasa"};
        String[] mas3 = {"asas", "asas", "asasa", "asasa"};
        String[] mas4 = {"asas"};
        String[] mas5 = {"asas", "asas", "asasa", "asasa", "aaaxax", "ddcdsc"};

        ArrayList<String[]> masList = new ArrayList<>();
        masList.add(mas1);
        masList.add(mas2);
        masList.add(mas3);
        masList.add(mas4);
        masList.add(mas5);

        masList.sort((o1, o2) -> o1.length - o2.length);

        for (String[] array : masList) {
            System.out.println(Arrays.toString(array));
        }

        Expression ex = (x) -> x % 2 == 0;
        int[] nums = {-1, -2, -3, -4, -5, 1, 2, 3, 4, 5};
        System.out.println(sum(nums, ex));

        System.out.println(sum(nums, ExpressionHelper::isEven));

        Expression ex2 = ExpressionHelper::isPositive;
        System.out.println(sum(nums, ex2));

        MathInterface<Integer> math = (f, s) -> f > s ? f : s;//тернарный оператор имба
        System.out.println(math.getMax(12, 54));

        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Ishenaly");
        System.out.println(user.getName());

        Operation<Integer> a = action(1);
        int asa = a.calculate(12, 4);
        int basa = action(2).calculate(223, 46);
        System.out.println(asa);
        System.out.println(basa);

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int listSize = random.nextInt(30);


        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(15));
        }
        System.out.println(action(list).execute(list));
    }
}

interface HowYears {
    String sus(Man man);
}

class Man {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

interface ListWork<V, T> {
    V execute(T t);
}

@FunctionalInterface
interface Operationable<T> {
    T calculate(T x, T y);
}

@FunctionalInterface
interface Operation<T> {
    T calculate(T x, T y);
}

@FunctionalInterface
interface Expression {
    boolean isEqualExp(int x);
}

interface MathInterface<T> {
    T getMax(T first, T second);
}

interface UserBuilder {
    User create(String name);
}

class ExpressionHelper {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }
}

class User {
    private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }
}