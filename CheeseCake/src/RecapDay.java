import java.util.LinkedList;

public class RecapDay {
	private static RecapDay instance;
	private LinkedList<CheeseCake> cakeOfTheDay;
	

	private RecapDay() {
		this.cakeOfTheDay = new LinkedList<CheeseCake>();
	}

	public void addNewOrder(CheeseCake cake) {
		cakeOfTheDay.add(cake);
		
	}

	public static synchronized RecapDay getJournalOfTheDay() {
		if (instance == null) {
			instance = new RecapDay();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "RecapDay [cakeOfTheDay=" + cakeOfTheDay + "]";
	}


	

}
