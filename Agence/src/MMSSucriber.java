
public class MMSSucriber implements Suscriber {

	private String phoneNumber;
	private String lastMsg;
	
	public  MMSSucriber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void update(Publisher s) {
		AgencePresseWithImage apwi = (AgencePresseWithImage) s;
		System.out.println("Envoi SMS à " + this.phoneNumber + " " + apwi.getLatestNews());
		this.lastMsg = apwi.getLatestNews();
	}

	public String getlastMsg() {
		return this.lastMsg;
	}

}
