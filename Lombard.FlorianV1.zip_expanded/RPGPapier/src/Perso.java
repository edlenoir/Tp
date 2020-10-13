
public class Perso {
	
	private String nomPerso;
	private String race;
	
	
	public Perso(String nomPerso, String race){
		this.nomPerso = nomPerso;
		this.race = race;
	}

	public String getnomPerso() {
		return nomPerso;
	}


	public String getRace() {
		return race;
	}
	
	@Override
	public String toString() {
		return this.getRace() + ", et se nomme " + this.getnomPerso()+ ".\n";
	}
}
