package JdkObs;

import java.util.Observable;
import java.util.Observer;

public class MMSSucriber implements Observer {

	private String phoneNumber;
	private String lastMsg;
	
	public  MMSSucriber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void update(Observable s,Object arg) {
		AgencePresseWithImage apwi = (AgencePresseWithImage) s;
		System.out.println("Envoi SMS à " + this.phoneNumber + " " + apwi.getLatestNews());
		this.lastMsg = apwi.getLatestNews();
	}

	public String getlastMsg() {
		return this.lastMsg;
	}

}
