
public abstract class Reservoir {
	private int nbCoupures;

	public Reservoir(int nbCoupures) {
		this.nbCoupures = nbCoupures;
	}

	public int getNbCoupures() {
		return this.nbCoupures;
	}

	public void setNbCoupures(int nbCoupures) {
		this.nbCoupures = nbCoupures;
	}
	public abstract int valeurCoupure();
	
	public int nbBilletsADelivrer(int montant) {
        if (montant > this.getNbCoupures()*this.valeurCoupure()) {
            return this.nbCoupures;    
        } else {
            return montant/this.valeurCoupure();
        }
    }
	public void delivrerBillets(int nbBillets) {
		this.setNbCoupures(this.nbCoupures - nbBillets);
		
	}

}
