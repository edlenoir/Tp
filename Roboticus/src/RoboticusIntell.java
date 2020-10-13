
public class RoboticusIntell extends Roboticus {
	
	private int nbNeurones;
	
	public RoboticusIntell (int nbNeurones,int taille) {
		super(taille);
		this.nbNeurones = nbNeurones;
	}

	public int getNbNeurones() {
		return nbNeurones;
	}

	protected void setNbNeurones(int nbNeurones) {
		this.nbNeurones = nbNeurones;
	}

	public int point() {
		return this.nbNeurones*super.getTaille();	
	}

	@Override
	public String toString() {
		return "RoboticusIntell [nbNeurones=" + nbNeurones + "]";
	}
	
	
}
