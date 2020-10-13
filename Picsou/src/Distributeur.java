import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e0d7daea-9e80-4f96-a924-00942a1d20f3")
public class Distributeur {
    @objid ("9300c3fc-0e60-4a1d-8cc6-684cb1c890db")
    private List<Reservoir> reservoir = new ArrayList<Reservoir> ();
    

    @objid ("32fbfaee-92f0-4d59-8a60-e049b50f02a1")
    public Distributeur(Reservoir50 réservoir50, Reservoir20 réservoir20, Reservoir10 réservoir10) {
        this.reservoir = new ArrayList<Reservoir> ();
        this.reservoir.add(0,réservoir50);
        this.reservoir.add(1,réservoir20);
        this.reservoir.add(2,réservoir10);
    }


    @objid ("2abc53e8-6310-40b3-8eeb-1e5e4cd204a7")
    public void retirerMontant(Carte carte, int code, int montant) {
    	if (carte.codeCorrect(code)) {
    		Compte compte = carte.getCompte();
    		if (compte.solde()>=montant) {
    			if(this.assezDeCoupures(montant)) {
    				this.delivrerBillets(montant);
    				compte.retirer(montant);
    			}
    		}
    	}
    }

    @objid ("a8b32a2b-2f30-4de8-b978-a57a8cf69925")
    private boolean assezDeCoupures(int montant) {
        int nc1 = this.reservoir.get(0).nbBilletsADelivrer(montant);
        int nc2 = this.reservoir.get(1).nbBilletsADelivrer(montant - nc1 * 50);
        int nc3 = this.reservoir.get(2).nbBilletsADelivrer(montant - nc1 * 50 - nc2 * 20);
        
        return montant == nc1*50 + nc2*20 + nc3*10;
    }

    @objid ("98df8e59-099b-43ad-acee-ef3afcf5c6fb")
    private void delivrerBillets(int montant) {
    	int somme = montant;
    	
    }

    @objid ("649f36b9-eb95-4cf9-bf5c-f7029f0efeaa")
    public List<Reservoir> getReservoirs() {
    	return this.reservoir;
    }

	@Override
	public String toString() {
		return "Distributeur [reservoir=" + reservoir + "]";
	}

}
