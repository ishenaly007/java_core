package exceptions;

public class InvalidCharactersExceptions extends Exception {
    String msg;

    public InvalidCharactersExceptions(String msg) {
        super(msg);
        this.msg = msg;
    }
}
