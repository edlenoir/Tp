
public class RoboticusSportif extends Roboticus {
	private int nbPattes;
	
	public RoboticusSportif (int taille, int nbPatte) {
		super(taille);
		this.nbPattes = nbPattes;
	}

	public int getNbPattes() {
		return this.nbPattes;
	}
	public int point() {
		return (this.nbPattes*super.getTaille());
	}

	@Override
	public String toString() {
		return "RoboticusSportif [nbPattes=" + nbPattes + "]";
	}
	
	
}
