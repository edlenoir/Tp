import java.nio.charset.Charset;

public class Touche{
	
	ListeCirculaire<Character> list;
		public Touche (String vtouche) {
			this.list = new ListeCirculaire<>();
			for (int i = 0; i<vtouche.length(); i++) {
				list.ajouter(vtouche.charAt(i));
			}
			
		}
	
	public char getCaractère(int nb) throws ListeVide {
		if (nb == 1) {
			return list.premier();
		}
		else {
			list.premier();
			int i = 1;
			while (i < nb - 1) {
				list.suivant();
				i++;
			}
			return list.suivant();
		}
	}
}
