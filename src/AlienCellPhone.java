/**
 * Interface for an AlienCellPhone which can send messages to Alien or Earth phones
 * and read messages from an AlienCellPhone.
 * 
 * @author Abel
 * @author Saul
 */
public interface AlienCellPhone {
	
	/**
	 * Sends message from an AlienCellPhone to the specified file.
	 * 
	 * @param fileName name of the file
	 */
	public void alienSendText(String fileName);
	
	/**
	 * Reads message from an AlienCellPhone.
	 * 
	 * @param fileName name of the file
	 */
	public void alienReadText(String fileName);
	
	/**
	 * Returns the name of the output file that contains
	 * the translated text.
	 * 
	 * @param fileName file containing translated text
	 * @return name of output file with translated text.
	 */
	public String translateText(String fileName);
}
