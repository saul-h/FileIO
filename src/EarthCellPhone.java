/**
 * Interface for a cellphone which can send messages from EarthCellphones to Alien or EarthCellPhones.
 * 
 * @author Abel
 * @author Saul
 */
public interface EarthCellPhone {
	/**
	 * Outputs a simple message in the specified language to the specified file.
	 * 
	 * @param languageType language the message is to be sent in
	 * @param fileName name of file where message is to be outputted to
	 * @throws InvalidLanguageException if message is sent in a language that is not supported
	 */
	public void sendMessage(String languageType, String fileName) 
			throws   InvalidLanguageException;
	
	/**
	 * Outputs the contents of the specified file.
	 * 
	 * @param fileName name of file from which message is to be read
	 */
	public void readMessage(String fileName);
}