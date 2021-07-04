package by.epamtc.korshun.task2.exception;

public class InappropriateValException extends  Exception{
    public InappropriateValException() {
    }

    public InappropriateValException(String message) {
        super(message);
    }

    public InappropriateValException(String message, Throwable cause) {
        super(message, cause);
    }

    public InappropriateValException(Throwable cause) {
        super(cause);
    }
}