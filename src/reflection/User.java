package reflection;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class User extends PersonReflec implements Comparable {
    private String login;
    private LocalDate lastLoginDate;
    private boolean isActive;
    private String password = "secret_password";

    public User(String name, int age) {
        super(name, age);
    }

    public boolean isActive() {
        return isActive;
    }

    @Deprecated(forRemoval = true, since = "2.0")
    public void purchase() {
        System.out.println("Купил");
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
