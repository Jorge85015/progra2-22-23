package airportManagement.src.main.exceptions;

public class EmptyException extends Exception {

    public EmptyException() {
        super("Given path is empty");
    }

    public EmptyException(String message) {
        super(message);
    }
}
