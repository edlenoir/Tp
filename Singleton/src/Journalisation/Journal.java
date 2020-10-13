package Journalisation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import Singleton.Singleton;

public class Journal {

	private StringBuffer log;
	private static final Map<Object,Journal> multitionInstance = new HashMap<Object,Journal>();

	private Journal() {
		this.log = new StringBuffer();
	}

	public void ajouterLog(String log) {
		Date d = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH'h'mm'm'ss's'SSS");
		this.log.append("[" + dateFormat.format(d) + "] " + log + "\n");
	}
	
	public static synchronized Journal getInstance(Object key) {
		Journal instance = multitionInstance.get(key);
		if(instance == null) {
			synchronized (Journal.class) {
				if(instance == null) {
					instance = new Journal();
					multitionInstance.put(key,instance);
				}
				
			}
		}
		return instance;

	}
	
	@Override
	public String toString() {
		return this.log.toString();
	}	
}
