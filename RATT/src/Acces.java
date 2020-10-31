import java.util.Date;

public class Acces {
	
	private Vehicule v;
	private Horaire horaire ;
	private Gategorie categorie;
	
	
	public Acces(Vehicule v, Gategorie cat) throws Exception {
		this.v = v;
		this.categorie = cat;
		this.horaire = new Horaire();
		long valeurTimeStamp = new Date().getTime();
		this.horaire.setDateEntree(valeurTimeStamp);
	}
	
	
	public long duréeAcces() {
		return this.horaire.getDateEntree();
	}
	
	public Vehicule vehicule() {
		return this.v;
	}
	
	public void cloturer () throws Exception , DejaInitialise {
		long valeurTimeStamp = new Date().getTime();
		this.horaire.setDateSortie(valeurTimeStamp);
	}


	public Gategorie getCategorie() {
		return categorie;
	}
	
}
