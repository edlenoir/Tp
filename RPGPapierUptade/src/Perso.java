
public class Perso {
	
	private String NomPerso;
	private String Race;
	
	
	public Perso(String nomPerso, String race){
		NomPerso = nomPerso;
		Race = race;
	}

	public String getNomPerso() {
		return NomPerso;
	}


	public String getRace() {
		return Race;
	}
	
	@Override
	public String toString() {
		return this.getRace() + ", et se nomme " + this.getNomPerso()+ ".\n";
	}



	
	
	

}
