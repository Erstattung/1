package main.Exceptions;

/**
 * Created by echerkas on 29.11.2015.
 */
public class WrongIdException extends ServiceOperationException{

    public WrongIdException() {
        super();
    }

    public WrongIdException(String message) {
        super(message);
    }
}