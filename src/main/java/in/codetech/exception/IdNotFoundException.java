package in.codetech.exception;

public class IdNotFoundException extends RuntimeException{

	String message ;

	public IdNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
