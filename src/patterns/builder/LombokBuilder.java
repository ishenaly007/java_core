package patterns.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class LombokBuilder {
    private String name;
    private String lastName;
    private int age;
}
