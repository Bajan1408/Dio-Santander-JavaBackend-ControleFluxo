public class ParametrosInvalidosException extends Exception {
    String message;

    public ParametrosInvalidosException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
