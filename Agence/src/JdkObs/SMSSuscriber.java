package JdkObs;

import java.util.Observable;
import java.util.Observer;

public class SMSSuscriber implements Observer {

	private String phoneNumber;
	private String lastMsg;
	
	public SMSSuscriber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void update(Observable s,Object arg) {
		AgencePresse afp = (AgencePresse) s;
		System.out.println("Envoi SMS à " + this.phoneNumber + " " + afp.getLatestNews());
		this.lastMsg = afp.getLatestNews();
	}

	public String getlastMsg() {
		return this.lastMsg;
	}

}
