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
