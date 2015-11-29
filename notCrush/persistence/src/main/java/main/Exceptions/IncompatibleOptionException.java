package main.Exceptions;

/**
 * Created by echerkas on 29.11.2015.
 */
public class IncompatibleOptionException extends ServiceOperationException {

    public IncompatibleOptionException(){
        super();
    }

    public IncompatibleOptionException(String message) {
        super(message);
    }
}