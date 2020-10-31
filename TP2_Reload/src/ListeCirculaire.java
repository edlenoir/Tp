import java.util.ArrayList;

public class ListeCirculaire<T> {
	
	ArrayList <T> ListeCirculaire ;
	int pointeur;
	
	public ListeCirculaire() {
		this.ListeCirculaire = new ArrayList<T>();
		this.pointeur = 0;
	}
	
	public void ajouter(T valeur) {
		ListeCirculaire.add(valeur);
	}
	
	public T premier() throws ListeVide {
		if (ListeCirculaire.isEmpty())
			throw new ListeVide("La liste est vide");
		this.pointeur = 0;
		return ListeCirculaire.get(0);
	}
	
	public T suivant() throws ListeVide {
		if (ListeCirculaire.isEmpty())
			throw new ListeVide("La liste est vide");
		if (this.pointeur< 10)
			this.pointeur ++;
		else {
			premier();
		}
		return ListeCirculaire.get(this.pointeur);
	}

	

}
