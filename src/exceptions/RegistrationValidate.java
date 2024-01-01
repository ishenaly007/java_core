package exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationValidate {
    void validateRegistration(String login, String password, String confirmPass)
            throws EmptyLoginException, InvalidCharactersExceptions, PasswordException, LengthException {
        if (login == null || login.isEmpty() ||
                password == null || password.isEmpty() ||
                confirmPass == null || confirmPass.isEmpty()) {
            throw new EmptyLoginException("Все поля должны быть заполнены!");
        }

        if (login.length() >= 20 || password.length() >= 20 || confirmPass.length() >= 20) {
            throw new LengthException("Поля не должны быть больше 20ти символов!");
        }

        if (!password.equals(confirmPass)) {
            throw new PasswordException("Пароли должны совпадать!");
        }

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9_]");
        Matcher matcher = pattern.matcher(login);
        Matcher matcher1 = pattern.matcher(confirmPass);
        Matcher matcher2 = pattern.matcher(password);
        if (matcher.find() || matcher1.find() || matcher2.find()) {
            throw new InvalidCharactersExceptions("Введены недопстимые символы!");
        }
    }

    public static void main(String[] args) {
        RegistrationValidate registration = new RegistrationValidate();
        try {                  //(●'◡'●)UwUO_O(≧∇≦)ﾉƪ(˘⌣˘)ʃ(⌐■_■)(👉ﾟヮﾟ)👉(❤️ ω ❤️)
            registration.validateRegistration("123gfb", "esfdf", "esfdf");
        } catch (PasswordException | EmptyLoginException | InvalidCharactersExceptions | LengthException e) {
            e.printStackTrace();
        }
    }
}
