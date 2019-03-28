/*
 * Abel Acosta
 * Saul Hernandez
 * March 28, 2019
 * Purpose: This program simulates an Earth phone that is able to send
 * messages to other Earth phones as well as send messages through a
 * UniveralTranslator to a universal translator.
 * Outputs a message in English, and that message translated to 
 * Klingon and Vulcan.
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
			System.out.println();
			
			// Send Klingon message
			et.sendMessage("Klingon", "klingon_message.txt");
			// Creating universal translator to translate message
			UniversalTranslator ut = new UniversalTranslator(new KlingonText());
			EarthCellPhone e3 = ut;
		    e3.readMessage("klingon_message.txt");
		    System.out.println();
		    
		    // Send Vulcan message
		    et.sendMessage("Vulcan", "vulcan_message.txt");
		    ut = new UniversalTranslator(new VulcanText());
		    e3 = ut;
		    e3.readMessage("vulcan_message.txt");
		    System.out.println();
		    
		    // Send unsupported language message
		    et.sendMessage("Martian", "martian_message.txt");
			
			
		} catch (InvalidLanguageException e) {
			System.out.println(e.getMessage());
		}
	}

}
