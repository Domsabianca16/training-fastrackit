package Main.java.Course10;

public class EntityNotFoundException extends RuntimeException {

    // The first explicit constructor that returns only an error message.

    public EntityNotFoundException(String message) {
        super(message);
    }


    /* The second explicit constructor that returns
     both an error message and the cause of the error.
     */


    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
