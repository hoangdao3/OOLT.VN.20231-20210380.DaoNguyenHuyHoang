package hust.soict.hedspi.aims.exception;

public class PlayerException extends Exception{

    public PlayerException(String message) {
        super(message);
        System.err.println(message);
    }

}
