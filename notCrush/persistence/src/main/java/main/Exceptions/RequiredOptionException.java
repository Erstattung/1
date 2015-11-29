package main.Exceptions;

/**
 * Created by echerkas on 29.11.2015.
 */
public class RequiredOptionException extends ServiceOperationException {

    public RequiredOptionException() {
        super();
    }

    public RequiredOptionException(String message) {
        super(message);
    }
}