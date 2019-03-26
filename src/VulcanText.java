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
		
		System.out.println("Vulcan: " + message);
	}

	@Override
	public String translateText(String fileName) {
		return "translated_"+fileName;
	}

}
