import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KlingonText implements AlienCellPhone{

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
		
		System.out.println("Klingon: " + message);
	}

	@Override
	public String translateText(String fileName) {
		return "translated_"+fileName;
	}

}
