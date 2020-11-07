

public class EmailSuscriber implements Suscriber {

	private String emailAdress;
	private String lastMsg;
	
	public EmailSuscriber(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	@Override
	public void update(Publisher s) {
		AgencePresse afp = (AgencePresse) s;
		System.out.println("Envoi email à " + this.emailAdress + " " + afp.getLatestNews());
		this.lastMsg = afp.getLatestNews();
	}

	public String getlastMsg() {
		return this.lastMsg;
	}


}
