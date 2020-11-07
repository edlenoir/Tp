package JdkObs;

import java.util.Observable;
import java.util.Observer;

public class EmailSuscriber implements Observer {

	private String emailAdress;
	private String lastMsg;
	
	public EmailSuscriber(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public void update(Observable s,Object arg) {
		AgencePresse afp = (AgencePresse) s;
		System.out.println("Envoi email à " + this.emailAdress + " " + afp.getLatestNews());
		this.lastMsg = afp.getLatestNews();
	}

	public String getlastMsg() {
		return this.lastMsg;
	}






}
