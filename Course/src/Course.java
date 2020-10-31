import java.util.HashMap;

public class Course {
	private int nbitem = 0;
	private HashMap<Achat,Integer> Course = new HashMap<Achat,Integer>();
	
	public boolean estVide () {
		return Course.isEmpty();
		
	}
	
	public void ajouterAchat (Achat item) {
		this.nbitem++;
		Course.put(item,nbitem);
	}
	
	public double montantTotal() {
		return 
	}
		
}
