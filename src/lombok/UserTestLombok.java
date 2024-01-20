package lombok;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class UserTestLombok {
    private String name;

    @ToString.Exclude
    private int age;

    public static void main(String[] args) {
        UserTestLombok user = new UserTestLombok("Tilek", 18);
        System.out.println(user);
    }
}
