import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Vulcan implimentation of an AlienCellPhone that is able
 * to read Vulcan messages from files.
 * 
 * @author Abel
 * @author Saul
 */
public class VulcanText implements AlienCellPhone{

	/**
	 * Default constructor for VulcanText.
	 */
	public VulcanText() {
		
	}
	
	/**
	 * Sends Alien language text to specified file.
	 * Unnecessary for this project.
	 * 
	 * @param fileName name of file
	 */
	@Override
	public void alienSendText(String fileName) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Outputs the Vulcan message from the specified file to the console.
	 * 
	 * @param fileName name of file containing Vulcan text
	 */
	@Override
	public void alienReadText(String fileName) {
		String message = null;
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while(scanner.hasNext()) {
				message = scanner.nextLine();
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // output error message
		}
		
		// output message in Vulcan
		System.out.println("Vulcan: " + message);
	}

	/**
	 * Returns the name of the file with the translated text
	 * 
	 * @param fileName file containing translated text
	 */
	@Override
	public String translateText(String fileName) {
		return "translated_"+fileName;
	}

	/**
	 * Returns the name of this class.
	 */
	@Override
	public String toString() {
		return "VulcanText";
	}

}
