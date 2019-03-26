public class UniversalTranslator implements EarthCellPhone{
	
	private AlienCellPhone alienTextMessage;
	
	public UniversalTranslator(AlienCellPhone mess) {
		this.alienTextMessage = mess;
	}
	
	public void readMessage(String fileName) {
		alienTextMessage.alienReadText(fileName);
	}
	
	public void sendMessage(String languageType, String fileName) {
		alienTextMessage.alienSendText(fileName);
	}
}
