import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Distributeur {
	
	private LinkedList<Reservoir> distributeur;
	
	public Distributeur( Reservoir r10, Reservoir r20, Reservoir r50) {
        this.distributeur = new LinkedList<Reservoir>();
        this.distributeur.add(r10);
        this.distributeur.add(r20);
        this.distributeur.add(r50);
    }
    
	
	public void retirerMontant(Carte carte, int code, int montant) {
		if(carte.codeCorrect(code)) {
			if(carte.getCompte().solde() > montant ) {
				if(this.assezDeCoupures(montant)) {
					this.delivrerBillets(montant);
					carte.getCompte().retirer(montant);
				}
				
			}
			
		}
			
	}
	

	private boolean assezDeCoupures(int montant) {
		int nc1;
		int nc2;
		int nc3;
		nc1 = this.distributeur.get(2).nbBilletsADelivrer(montant);
		nc2 = this.distributeur.get(1).nbBilletsADelivrer(montant - nc1 * 50);
		nc3 = this.distributeur.get(0).nbBilletsADelivrer(montant - nc1 * 50 - nc2 * 20);
		return nc3 * 10 + nc2 * 20 + nc1 * 50== montant;
	}
	
	private void delivrerBillets(int montant) {
		int nc1;
		int nc2;
		int nc3;
		nc1 = this.distributeur.get(2).nbBilletsADelivrer(montant);
		nc2 = this.distributeur.get(1).nbBilletsADelivrer(montant - nc1 * 50);
		nc3 = this.distributeur.get(0).nbBilletsADelivrer(montant - nc1 * 50 - nc2 * 20);
		this.distributeur.get(2).delivrerBillets(nc1);
		this.distributeur.get(1).delivrerBillets(nc2);
		this.distributeur.get(0).delivrerBillets(nc3);
	}
	
	
	public LinkedList<Reservoir> getResevoirs() {
		return distributeur;
	}

}
