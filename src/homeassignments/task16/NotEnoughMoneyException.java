package homeassignments.task16;

public class NotEnoughMoneyException extends RuntimeException {
    String errorCode;

    public NotEnoughMoneyException(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}