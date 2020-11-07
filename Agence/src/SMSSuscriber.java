

public class SMSSuscriber implements Suscriber {

	private String phoneNumber;
	private String lastMsg;
	
	public SMSSuscriber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void update(Publisher s) {
		AgencePresse afp = (AgencePresse) s;
		System.out.println("Envoi SMS à " + this.phoneNumber + " " + afp.getLatestNews());
		this.lastMsg = afp.getLatestNews();
	}

	public String getlastMsg() {
		return this.lastMsg;
	}

}
