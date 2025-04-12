package homeassignments.task16;

public class CurrencyNotFoundException extends RuntimeException {
    private String errorCode;

    public CurrencyNotFoundException(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}