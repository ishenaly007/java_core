package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {
    public static void main(String[] args) throws Exception {
        int[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        /*
        int count = 0;
        for (int i : array) {
            if (i > 0) {
                count++;
            }
        }
        System.out.println(count);
        */
        long count = Arrays.stream(array).filter(c -> c > 0).count();
        //               открытие        конвеерный м       терминальный метод
        System.out.println(count);


        long streamA1 = Stream.of("a1", "a2", "a3").filter("a1"::equals).count();
        long streamA12 = Stream.of("a1", "a2", "a3").filter(a -> a.equals("a1")).count();
        System.out.println(streamA1 + " a1");
        System.out.println(streamA12 + " a1");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 4, 5);
        //skip пропускает N первых элементов
        System.out.println(nums.stream().skip(3).collect(Collectors.toList()));
        //distinct убирает дубликаты
        System.out.println(nums.stream().distinct().collect(Collectors.toList()));
        //map может преобразовать каждый элемент стрима
        System.out.println(nums.stream().map(a -> a + 1).collect(Collectors.toList()));
        //peek возвращает этот же стрим, но применяет к каждому функцию
        System.out.println(nums.stream().peek(a -> System.out.println(a + " lox")).collect(Collectors.toList()));
        nums.forEach(System.out::print);
        Stream<Integer> stream2 = nums.stream();
        //Stream<String> streamFromFiles = Files.lines(Path.of("C:"));
        IntStream streamStr = "asas".chars();
        Stream.builder().add("asas1").add("asas2").add("asas3").build();
        Stream<Integer> streamFromIterate = Stream.iterate(2, n -> n + 1);
        //limit  ограничивает элем. только первых N
        streamFromIterate.limit(10).forEach(System.out::println);
        //sorted сортирует, можно использовать Comparator
        streamFromIterate.sorted().forEach(System.out::println);
        //findFirst возвращает первый элемент стрима, возвращает Optional
        streamFromIterate.sorted().findFirst().orElse(1);
        //collect собирает все что пришло в стриме в конце(можно собирать не только в toList())
        //reduse позволяет делать агрегатные функции и возвращает 1 элемент
        nums.stream().reduce((a, b) -> a + b).orElse(0);

    }
}
