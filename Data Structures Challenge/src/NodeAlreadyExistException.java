public class NodeAlreadyExistException extends Exception{
    public NodeAlreadyExistException() {
    }

    public NodeAlreadyExistException(String message) {
        super(message);
    }

    public NodeAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public NodeAlreadyExistException(Throwable cause) {
        super(cause);
    }

    public NodeAlreadyExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
