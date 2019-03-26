public class InvalidLanguageException extends Exception{
	
	private static final long serialVersionUID = 1L;
	String message;

	public InvalidLanguageException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
