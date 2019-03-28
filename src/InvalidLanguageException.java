/**
 * This exception is thrown when there is an attempt to use a language that is
 * not supported.
 * 
 * @author Saul
 * @author Abel
 */
public class InvalidLanguageException extends Exception{
	
	private static final long serialVersionUID = 1L;
	/**
	 * error message
	 */
	String message;

	/**
	 * Default constructor with message denoting invalid language.
	 */
	public InvalidLanguageException() {
		this.message = "Invalid language";
	}
	
	/**
	 * Constructs an exception with the specified error message.
	 * @param message error message
	 */
	public InvalidLanguageException(String message) {
		this.message = message;
	}
	
	/**
	 * Returns the error message.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Returns a description of this instance of this exception.
	 */
	@Override
	public String toString() {
		return "InvalidLanguageException [message=" + message + "]";
	}
}
