import java.util.LinkedList;
import java.util.List;

public class Equipe  {
	
	private String nom;
	protected LinkedList<Perso> lPerso;
	protected LinkedList<Classe> lClasse ;
	



	public Equipe(String nom) {
		this.nom = nom;
		this.lPerso = new LinkedList<Perso>();
		this.lClasse = new LinkedList<Classe>();
	}

	public void AjouterUnMenbre(Perso p,Classe c) {
		lPerso.add(p);
		lClasse.add(c);
	}
	
	public void EnleverUnMenbre(int i) {
		lPerso.remove(i);
		lClasse.remove(i);
	}

	public LinkedList<Perso> getlPerso() {
		return lPerso;
	}

	public void setlPerso(LinkedList<Perso> lPerso) {
		lPerso = lPerso;
	}

	public LinkedList<Classe> getlClasse() {
		return lClasse;
	}

	public void setlClasse(LinkedList<Classe> lClasse) {
		lClasse = lClasse;
	}

	@Override
	public String toString() {
		return "Le nom de votre equipe est " + nom + "";
	}



}
