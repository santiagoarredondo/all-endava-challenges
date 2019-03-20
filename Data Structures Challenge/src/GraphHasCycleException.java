public class GraphHasCycleException extends Exception{
    public GraphHasCycleException() {
    }

    public GraphHasCycleException(String message) {
        super(message);
    }

    public GraphHasCycleException(String message, Throwable cause) {
        super(message, cause);
    }

    public GraphHasCycleException(Throwable cause) {
        super(cause);
    }

    public GraphHasCycleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
