package Journalisation;
import java.awt.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Journal {

	private StringBuffer log;
	private static Journal journal1;
	private static Journal journal2;

	

	private Journal() {
		this.log = new StringBuffer();
	}
	
	public static synchronized Journal getInstance1() {
		if(journal1 == null) {
			journal1 = new Journal();
		}
		return journal1;
	}
	
	public static synchronized Journal getInstance2() {
		if(journal2 == null) {
			journal2 = new Journal();
		}
		return journal2;
	}
	

	public  void ajouterLog(String log) {
		Date d = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH'h'mm'm'ss's'SSS");
		this.log.append("[" + dateFormat.format(d) + "] " + log + "\n");
	}

	@Override
	public String toString() {
		return this.log.toString();
	}	
}
