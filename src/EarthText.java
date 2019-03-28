import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This implementation of EarthCellPhone sends a message (provided it is written in a supported
 * language) to an EarthCellPhone or AlienCellPhone as well as reads messages from an EarthCellPhone.
 * 
 * @author Abel
 * @author Saul
 */
public class EarthText implements EarthCellPhone{
	
	/**
	 * List of languages supported by EarthText object.
	 */
	ArrayList<String> validLanguages;
	
	/**
	 * Constructs a new EarthText object with Earth, Klingon and Vulcan listed as valid
	 * languages by default.
	 */
	public EarthText() {
		validLanguages = new ArrayList<String>();
		addLanguage("Earth");
		addLanguage("Klingon");
		addLanguage("Vulcan");
	}
	
	/**
	 * Adds the language to the list of supported languages.
	 * @param language language to be added
	 * 
	 */
	public void addLanguage(String language) {
		validLanguages.add(language);
	}

	/**
	 * Outputs a simple message in the specified language to the specified file. In order for the 
	 * message to send, the languageType must be included in this object's list of validLanguages.
	 * Also the file with the name fileName must exist.
	 * 
	 * @param languageType language the message is to be sent in
	 * @param fileName name of file where message is to be outputted to
	 * 
	 * @throws InvalidLanguageException if message is sent in a language that is not supported
	 */
	@Override
	public void sendMessage(String languageType, String fileName) throws InvalidLanguageException {
		boolean invalidLanguage = true;
		
		// check that the specified languageType is included in the list of validLanguages
		for(String language : validLanguages) {
			if(language.equals(languageType)) {
				invalidLanguage = false;
				break;
			}
		}
		
		// throws exception with message if language is not supported
		if(invalidLanguage) {
			throw new InvalidLanguageException(languageType + " not supported.");
		}
		
		try {
			PrintWriter pw = new PrintWriter(fileName);
			pw.write("This is earth to " + languageType + " text.");
			pw.close();
		} catch (FileNotFoundException e) {
			// throw exception if file is not found
			e.printStackTrace();
		}
		
		System.out.println(languageType + " message sent.");
	}

	/**
	 * Returns a list of the supported languages in this instance.
	 */
	@Override
	public String toString() {
		return "EarthText [validLanguages=" + validLanguages + "]";
	}

	/**
	 * Outputs the contents of the specified file to the console.
	 * 
	 * @param fileName name of file from which message is to be read
	 */
	@Override
	public void readMessage(String fileName) {
		// initialize message String to be outputted
		String message = null;
		
		try {
			// create scanner object pointed at file
			Scanner scanner = new Scanner(new File(fileName));
			
			// read the next line into message String
			while(scanner.hasNext()) {
				message = scanner.nextLine();
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();// print out error message
		}
		
		// output message
		System.out.println("Earth: " + message);
	}
}
