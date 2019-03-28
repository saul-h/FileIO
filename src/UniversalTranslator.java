import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * UniversalTranslator class takes in
 * 
 * @author Abel
 * @author Saul
 */
public class UniversalTranslator implements EarthCellPhone{
	
	/**
	 * Denotes the language messages will be translated to.
	 */
	private AlienCellPhone alienTextMessage;
	
	/**
	 * Default constructor with null AlienCellPhone
	 */
	public UniversalTranslator() {
		this.alienTextMessage = null;
	}
	
	/**
	 * Constructs a translator to translate to the specified language.
	 * 
	 * @param mess language message will be translated to
	 */
	public UniversalTranslator(AlienCellPhone mess) {
		this.alienTextMessage = mess;
	}
	
	/**
	 * Translates the message in the file to the Alien Language denoted by
	 * which type (Vulcan, Klingon) of AlienCellPhone is being used.
	 * 
	 * @param fileName file to be translated into Alien Language
	 */
	public void readMessage(String fileName) {
		String message = null;
		
		// Translate to Klingon
		if(alienTextMessage instanceof KlingonText) {
			try {
				Scanner scanner = new Scanner(new File(fileName));
				while(scanner.hasNext()) {
					message = scanner.nextLine();
					message = message.replace('a', 't');
					message = message.replace('e', 'B');
					message = message.replace('i', 'n');
					message = message.replace('o', 'n');
					message = message.replace('u', 'q');
					message = message.replace('t', 'v');
					message = message.replace('n', 'w');
				}
				scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				PrintWriter pw = new PrintWriter(alienTextMessage.translateText(fileName));
				pw.write(message);
				pw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		// Translate to Vulcan
		if(alienTextMessage instanceof VulcanText) {
			try {
				Scanner scanner = new Scanner(new File(fileName));
				while(scanner.hasNext()) {
					message = scanner.nextLine();
					message = message.replace('a', 'b');
					message = message.replace('e', 'q');
					message = message.replace('i', 'g');
					message = message.replace('o', 'l');
					message = message.replace('u', 'n');
					message = message.replace('t', 'q');
					message = message.replace('n', 'm');
					message = message.replace('T', 'a');
				}
				scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				PrintWriter pw = new PrintWriter(alienTextMessage.translateText(fileName));
				pw.write(message);
				pw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		// Read text
		alienTextMessage.alienReadText(alienTextMessage.translateText(fileName));
	}
	
	/**
	 * Sends a message in an alien language to the specified target file
	 * 
	 * @param languageType name of language
	 * @param fileName name of target file
	 */
	public void sendMessage(String languageType, String fileName) {
		alienTextMessage.alienSendText(fileName);
	}

	/**
	 * Returns the type of AlienCellPhone used in this instance.
	 */
	@Override
	public String toString() {
		return "UniversalTranslator [alienTextMessage=" + alienTextMessage + "]";
	}
}
