
public abstract class Roboticus {
	private int taille ;
	
	
	public Roboticus ( int taille) {
		this.taille = taille;
	}
	
	
	public int getTaille() {
		return this.taille;
	}
	
	public abstract int point();
	
}
