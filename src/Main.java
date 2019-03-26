/*
 * Abel Acosta
 * Saul Hernandez
 */
public class Main {

	public static void main(String[] args) {
		EarthText et = new EarthText();
		EarthText et2 =  new EarthText();
		
		try {
			// Send earth message
			et.sendMessage("Earth", "earth_message.txt");
			// Read earth message
			et2.readMessage("earth_message.txt");
			
			// Send Klingon message
			et.sendMessage("Klingon", "klingon_message.txt");
			
			// Creating universal translator to translate message
			UniversalTranslator ut = new UniversalTranslator(new KlingonText());
			EarthCellPhone e3 = ut;
		    e3.readMessage("Klingon.txt");
			
			
		} catch (InvalidLanguageException e) {
			System.out.println(e.getMessage());
		}
	}

}
