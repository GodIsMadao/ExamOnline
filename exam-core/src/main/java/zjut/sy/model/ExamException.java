package zjut.sy.model;

/**
 * Created by dell on 2016/4/19.
 */
public class ExamException extends RuntimeException {
    public ExamException(String message) {
        super(message);
    }

    public ExamException() {
        super();
    }

    public ExamException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExamException(Throwable cause) {
        super(cause);
    }

    protected ExamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
