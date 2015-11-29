package main.Exceptions;

/**
 * Created by echerkas on 29.11.2015.
 */
public class ServiceOperationException  extends Exception{
    public ServiceOperationException() {
        super();
    }

    public ServiceOperationException(String message) {
        super(message);
    }

    public ServiceOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
