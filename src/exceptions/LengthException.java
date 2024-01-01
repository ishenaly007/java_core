package exceptions;

public class LengthException extends Exception {
    String msg;

    public LengthException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
