package lesson13;

public class UncheckedException extends RuntimeException {
    public UncheckedException(String mess) {
        super(mess);

    }
    public UncheckedException(String mess, Throwable cause) {
        super(mess, cause);
    }
    public UncheckedException() {
        super();
    }
}
