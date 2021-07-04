package by.epamtc.korshun.task2.exception;

public class NullBasketException extends Exception {
    public NullBasketException() {
    }

    public NullBasketException(String message) {
        super(message);
    }

    public NullBasketException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullBasketException(Throwable cause) {
        super(cause);
    }
}
