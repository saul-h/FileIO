import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EarthText implements EarthCellPhone{
	
	ArrayList<String> validLanguages;
	
	public EarthText() {
		validLanguages = new ArrayList<String>();
		validLanguages.add("Earth");
		validLanguages.add("Klingon");
		validLanguages.add("Vulcan");
	}

	@Override
	public void sendMessage(String languageType, String fileName) throws InvalidLanguageException{
		boolean invalidLanguage = true;
		for(String language : validLanguages) {
			if(language.equals(languageType)) {
				invalidLanguage = false;
				break;
			}
		}
		
		if(invalidLanguage) {
			throw new InvalidLanguageException(languageType + " not supported.");
		}
		
		try {
			PrintWriter pw = new PrintWriter(fileName);
			pw.write("This is earth to " + languageType + " text.");
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(languageType + " message sent.");
	}

	@Override
	public void readMessage(String fileName) {
		String message = null;
		try {
			Scanner scanner = new Scanner(new File(fileName));
			while(scanner.hasNext()) {
				message = scanner.nextLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Earth: " + message);
	}

}
