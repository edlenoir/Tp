import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Parking {
	
	private Acces acces;
	private HashMap<String,LinkedList<Acces>> Hist ;
	
	public Parking() {
		Hist = new HashMap <String,LinkedList<Acces>>();
	}
	
	public boolean estVide() {
		return this.Hist.isEmpty();
	}
	
	public void entrer(Vehicule v) throws Exception {
		Acces dernierAcces = this.Hist.get(v.getImmatriculation()).getLast();
		
		Acces entre = new Acces(v,Gategorie.SMALL);
		this.Hist.put(v.getImmatriculation(), new LinkedList<Acces>());
		this.Hist.get(v.getImmatriculation()).add(entre);
		
	}
	
	
	

}
