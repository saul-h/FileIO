import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UniversalTranslator implements EarthCellPhone{
	
	private AlienCellPhone alienTextMessage;
	
	public UniversalTranslator(AlienCellPhone mess) {
		this.alienTextMessage = mess;
	}
	
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
	
	public void sendMessage(String languageType, String fileName) {
		alienTextMessage.alienSendText(fileName);
	}
}
