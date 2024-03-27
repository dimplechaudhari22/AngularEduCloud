package in.codetech.exception;

public class DataNotPresentException extends RuntimeException {

	String message ;

	public DataNotPresentException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
