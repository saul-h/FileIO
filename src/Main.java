/*
 * Abel Acosta
 * Saul Hernandez
 */
public class Main {

	public static void main(String[] args) {
		EarthText et = new EarthText();
		EarthText et2 =  new EarthText();
		
		try {
			et.sendMessage("Earth", "earth_message.txt");
			
			et2.readMessage("earth_message.txt");
			
			et.sendMessage("Klingon", "Klingon.txt");
			
			UniversalTranslator ut = new UniversalTranslator(new KlingonText());
			EarthCellPhone e3 = (EarthCellPhone) ut;
		    e3.readMessage("Klingon.txt");
			
		} catch (InvalidLanguageException e) {
			System.out.println(e.getMessage());
		}
	}

}
