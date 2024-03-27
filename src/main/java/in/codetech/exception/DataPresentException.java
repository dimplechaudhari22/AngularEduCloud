package in.codetech.exception;

public class DataPresentException extends RuntimeException {

	String message;

	public DataPresentException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
