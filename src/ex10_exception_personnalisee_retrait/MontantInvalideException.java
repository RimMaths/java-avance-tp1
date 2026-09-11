package ex10_exception_personnalisee_retrait;

public class MontantInvalideException extends RuntimeException {
    public MontantInvalideException(String message) {
        super(message);
    }
}
