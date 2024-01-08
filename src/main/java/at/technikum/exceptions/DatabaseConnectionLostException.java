package at.technikum.exceptions;

public class DatabaseConnectionLostException extends Exception {

    public DatabaseConnectionLostException(String message) {
        super(message);
    }
}
