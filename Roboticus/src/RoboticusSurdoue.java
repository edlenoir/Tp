
public class RoboticusSurdoue extends RoboticusIntell {
	
	public RoboticusSurdoue (int nbNeurones,int taille) {
		super(nbNeurones,taille);
	}
	public int point() {
		return this.getNbNeurones()*2;
	}
	
	public void ajouterNeurones(int neurones) {
		setNbNeurones(this.getNbNeurones()+neurones);
	}
	
	
	@Override
	public String toString() {
		return "RoboticusSurdoue [point()=" + point() + "]";
	}
	
	}

