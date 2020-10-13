
import java.util.LinkedList;
import java.util.List;

public class Equipe  {
	
	private String Nom;
	protected LinkedList<Perso> LPerso;
	protected LinkedList<Classe> LClasse ;
	



	public Equipe(String nom) {
		this.Nom = nom;
		this.LPerso = new LinkedList<Perso>();
		this.LClasse = new LinkedList<Classe>();
	}

	public void AjouterUnMenbre(Perso p,Classe c) {
		LPerso.add(p);
		LClasse.add(c);
	}
	
	public void EnleverUnMenbre(int i) {
		LPerso.remove(i);
		LClasse.remove(i);
	}

	public LinkedList<Perso> getLPerso() {
		return LPerso;
	}

	public void setLPerso(LinkedList<Perso> lPerso) {
		LPerso = lPerso;
	}

	public LinkedList<Classe> getLClasse() {
		return LClasse;
	}

	public void setLClasse(LinkedList<Classe> lClasse) {
		LClasse = lClasse;
	}

	@Override
	public String toString() {
		return "Le Nom de votre equipe est " + Nom + "";
	}



}
