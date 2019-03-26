import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VulcanText implements AlienCellPhone{

	@Override
	public void alienSendText(String fileName) {
		// TODO Auto-generated method stub
		
	}

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
			e.printStackTrace();
		}
		
		System.out.println("Vulcan: " + message);
	}

	@Override
	public String translateText(String fileName) {
		return "translated_"+fileName;
	}

}
