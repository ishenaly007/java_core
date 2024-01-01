package exceptions;

public class EmptyLoginException extends Exception {
    String msg;

    public EmptyLoginException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
