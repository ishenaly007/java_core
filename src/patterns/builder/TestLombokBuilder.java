package patterns.builder;

public class TestLombokBuilder {
    public static void main(String[] args) {
        LombokBuilder lombokBuilder = LombokBuilder.builder()
                .age(17)
                .name("Ishenaly")
                .lastName("Narkozuev")
                .build();
        System.out.println(lombokBuilder);

    }
}
