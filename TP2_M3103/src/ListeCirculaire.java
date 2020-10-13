import java.util.ArrayList;

public class ListeCirculaire<T> {
	ArrayList<T> listeCirculaire;
	int compteur = 0;
	
	public ListeCirculaire() {
		this.listeCirculaire = new ArrayList<T>();
	}

	public void ajouter (T valeur) {
		this.listeCirculaire.add(valeur);
	}
	
	public T premier() throws ListeVide{
		if (this.listeCirculaire.isEmpty()) {
			throw new ListeVide("La liste est vide");
		}
		compteur = 0;
		return this.listeCirculaire.get(compteur);
	}
	
	public ArrayList<T> getListeCirculaire() {
		return listeCirculaire;
	}

	public T suivant() throws ListeVide{
		if (this.listeCirculaire.isEmpty()) {
			throw new ListeVide("La liste est vide");
		}
		if(this.compteur == this.listeCirculaire.size())
			premier();
		return this.listeCirculaire.get(this.compteur + 1); 
	}


}
