import java.util.Calendar;

import java.util.Scanner;

public class JeuInterpreteur {

	public static void main(String[] args) {
		Interpreteur ohce = new Interpreteur();
		Scanner sc = new Scanner(System.in);
		while(true) {
			if (ohce.isOff()) {
				Calendar calendar = Calendar.getInstance();
				ohce.setTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
			}
			System.out.print(ohce.promptQuestion());
			String commande = sc.nextLine();
			ohce.sendCommand(commande);
			System.out.print(ohce.getResponse());
		}
	}
}
