package JdkObs;

import java.util.Observer;

public class Application {

	public static void main(String[] args) {
		AgencePresse afp = new AgencePresse();
		AgencePresseWithImage apwi = new AgencePresseWithImage();
		Observer email = new EmailSuscriber("nom_prénom@gmail.com");
		Observer tel = new SMSSuscriber("+33 06 xx xx xx xx");
		Observer mms = new MMSSucriber("+33 09 03 03 24 12");
		afp.addObserver(tel);
		afp.addObserver(email);
		apwi.addObserver(mms);
		
		for (int i = 1; i <= 101; i++)
			afp.addNews("Message important num " + i);
	
	
		for (int i = 1; i <= 101; i++)
			apwi.addNews("Message important num " + i,"Image de la news " + i);
		}

}
