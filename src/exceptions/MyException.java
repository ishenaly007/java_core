package exceptions;

public class MyException extends RuntimeException {
    String msg, fileName;

    public MyException(String msg, String fileName) {
        super(msg);
        this.msg = msg;
        this.fileName = fileName;
    }

}
