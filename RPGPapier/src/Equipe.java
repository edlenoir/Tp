import java.util.LinkedList;
import java.util.List;

public class Equipe  {
	
	private String nom;
	//J'ai changer le type de la LikendList car je ne pouvait l'utiliser 
	protected LinkedList<Object> lPerso;
	protected LinkedList<Object> lClasse ;
	
	public Equipe(String nom) {
		this.nom = nom;
		this.lPerso = new LinkedList<Object>();
		this.lClasse = new LinkedList<Object>();
	}
	//J'ai crée plus AjouterMenbre pour les differente classe pour palier au manque de l'heritage
	public void AjouterUnMenbrePerso(Perso p,ClassePerso c) {
		lPerso.add(p);
		lClasse.add(c);
	}
	public void AjouterUnMenbreMage(Perso p,Mage c) {
		lPerso.add(p);
		lClasse.add(c);
	}
	public void AjouterUnMenbreVoleur(Perso p,Voleur c) {
		lPerso.add(p);
		lClasse.add(c);
	}
	public void AjouterUnMenbreGuerrier(Perso p,Guerrier c) {
		lPerso.add(p);
		lClasse.add(c);
	}

	
	public void EnleverUnMenbre(int i) {
		lPerso.remove(i);
		lClasse.remove(i);
	}

	public LinkedList<Object> getlPerso() {
		return lPerso;
	}

	public void setlPerso(LinkedList<Object> lPerso) {
		this.lPerso = lPerso;
	}

	public LinkedList<Object> getlClasse() {
		return lClasse;
	}

	public void setlClasse(LinkedList<Object> lClasse) {
		this.lClasse = lClasse;
	}

	@Override
	public String toString() {
		return "Le nom de votre equipe est " + nom + "";
	}



}
