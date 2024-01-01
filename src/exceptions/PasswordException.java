package exceptions;

public class PasswordException extends Exception {
    String msg;

    public PasswordException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
