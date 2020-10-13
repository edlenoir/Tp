public class Mot {
	
	private String chaine;
	
	private int nbOcc;
	
	public Mot(String chaine) {
		this.chaine = chaine;
		this.nbOcc = 1;
	}
	
	public String getChaine() {
		return this.chaine;
	}

	public int getNbOcc() {
		return this.nbOcc;
	}
	
	public int incNbOcc() {
		return this.nbOcc++;
	}

}
