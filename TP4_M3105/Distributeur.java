package atm;

import java.util.LinkedList;
import java.util.List;

public class Distributeur {
	
	private EtatDistributeur etat;
	
	public Distributeur(int nb50, int nb20, int nb10) {
		this.etat = new EtatDistributeur();
		recharger(nb50, nb20, nb10);
	}

	public void recharger(int nb50, int nb20, int nb10) {
		this.etat.setNb50Disponible(nb50);
		this.etat.setNb20Disponible(nb20);
		this.etat.setNb10Disponible(nb10);
	}
	
	public List<Couple> donnerBillets(int montant) {
		List<Couple> proposition = new LinkedList<Couple>();
		
		// Gestion des billets de 50 €
		if (montant > 50) {
			int nBillets50 = Math.min((int)Math.ceil(montant/2/50), this.etat.getNb50Disponible());
			montant -= nBillets50*50;
			this.etat.setNb50Disponible(this.etat.getNb50Disponible() - nBillets50);
			if (nBillets50 > 0) {
				proposition.add(new Couple(50,nBillets50));
			}
		}
        
		//Gestion des billets de 20 €
		if (montant > 20) {
			int nBillets20 = 0;
			if (montant % 20 == 0) {
				nBillets20 = montant / 20 -1;
			}
			else {
				nBillets20 = montant / 20;
			}
			nBillets20 = Math.min(nBillets20, this.etat.getNb20Disponible());
			montant -= nBillets20*20;
			this.etat.setNb20Disponible(this.etat.getNb20Disponible() - nBillets20);
			proposition.add(new Couple(20,nBillets20));
		}
        
		//Gestion des billets de 10 €
		if (montant > 0) {
			int nBillets10 = Math.min(montant/10, this.etat.getNb10Disponible());
			montant -= nBillets10*10;
			this.etat.setNb10Disponible(this.etat.getNb10Disponible() - nBillets10);
			proposition.add(new Couple(10,nBillets10));
		}
		
		return proposition;
    }

	public String toStringProposition(List<Couple> proposition, int montant) {
		StringBuffer res = new StringBuffer();
		res.append("Montant à débiter : " + montant + "€ \n");
		for (Couple c : proposition) {
			res.append(c.toString() + '\n');
		}
		res.append("Montant restant dû : " + this.montantRestantDû(proposition, montant));
		return res.toString();
	}
	
	public int montantRestantDû(List<Couple> proposition, int montant) {
		int montantRestantDû = montant;
		for (Couple c : proposition) {
			montantRestantDû -= c.getValeurBillet() * c.getNombreBilletsDélivrés();
		}
		return montantRestantDû;
	}
}
