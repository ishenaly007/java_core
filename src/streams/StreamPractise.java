package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamPractise {
    public static void main(String[] args) {
        Collection list = Arrays.asList("a1", "a2", "a3", "a4", "a1", "a5");
        System.out.println(list.stream().filter(a -> a.equals("a1")).count());//"a1"::equals
        System.out.println(list.stream().findFirst().orElse("0"));
        System.out.println(list.stream().skip(list.size() - 1).findFirst().orElse("empty"));
        System.out.println(list.stream().filter("a3"::equals).findFirst().get());
        System.out.println(list.stream().skip(2).findFirst().get());
        System.out.println(list.stream().skip(1).limit(2).toList());
    }
}
