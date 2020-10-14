
import java.util.LinkedList;
import java.util.List;

public class Distributeur {
	
	private EtatDistributeur etat;
	CalculatorBillets50 c50 = new CalculatorBillets50();
    CalculatorBillets20 c20 = new CalculatorBillets20();
    CalculatorBillets10 c10 = new CalculatorBillets10();
    CalculatorBillets5 c5 = new CalculatorBillets5();
    
	public Distributeur(int nb50, int nb20, int nb10) {
		this.etat = new EtatDistributeur();
		recharger(nb50, nb20, nb10);
	}
	
	public Distributeur(int nb50,int nb20,int nb10 ,int nb5) {
		this.etat = new EtatDistributeur();
		recharger(nb50, nb20, nb10, nb5);
	}

	private void recharger(int nb50, int nb20, int nb10, int nb5) {
		this.etat.setNb50Disponible(nb50);
		this.etat.setNb20Disponible(nb20);
		this.etat.setNb10Disponible(nb10);
		this.etat.setNb5Disponible(nb5);
	}

	public void recharger(int nb50, int nb20, int nb10) {
		this.etat.setNb50Disponible(nb50);
		this.etat.setNb20Disponible(nb20);
		this.etat.setNb10Disponible(nb10);
	}
	
	public List<Couple> donnerBillets(int montant) {
		List<Couple> proposition = new LinkedList<Couple>();
		WrapperMontant wrapper = new WrapperMontant(montant);
		c50.setSuivant(c20);
		c20.setSuivant(c10);
		c10.setSuivant(null);

		
		// Gestion des billets de 50 €
		c50.donnerBillets(wrapper, proposition,this.etat);
        montant = wrapper.getMontant();
        		
		//Gestion des billets de 20 €
		//c20.donnerBillets(wrapper, proposition,this.etat);
        //montant = wrapper.getMontant();
		//Gestion des billets de 10 €
		//c10.donnerBillets(wrapper, proposition,this.etat);
		//montant = wrapper.getMontant();
		
		return proposition;
    }
	
	public List<Couple> donnerBilletsPetitesCoupures(int montant) {
		List<Couple> proposition = new LinkedList<Couple>();
		WrapperMontant wrapper = new WrapperMontant(montant);
		c5.setSuivant(c10);
		c10.setSuivant(c20);
		c20.setSuivant(c50);
		c50.setSuivant(null);
		c5.donnerBillets(wrapper, proposition,this.etat);
        montant = wrapper.getMontant();
		
		return proposition;
	}
	
	public List<Couple> donnerBilletsGrossesCoupures(int montant) {
		List<Couple> proposition = new LinkedList<Couple>();
		WrapperMontant wrapper = new WrapperMontant(montant);
		c50.setSuivant(c20);
		c20.setSuivant(c10);
		c10.setSuivant(c5);
		c5.setSuivant(null);
		c50.donnerBillets(wrapper, proposition,this.etat);
        montant = wrapper.getMontant();
		return proposition;	
	}
	

	public String toStringProposition(List<Couple> proposition, int montant) {
		StringBuffer res = new StringBuffer();
		res.append("Montant à débiter : " + montant + "€ \n");
		for (Couple c : proposition) {
			res.append(c.toString() + '\n');
		}
		res.append("Montant restant dû : " + this.montantRestantDu(proposition, montant));
		return res.toString();
	}
	
	public int montantRestantDu(List<Couple> proposition, int montant) {
		int montantRestantDû = montant;
		for (Couple c : proposition) {
			montantRestantDû -= c.getValeurBillet() * c.getNombreBilletsDelivres();
		}
		return montantRestantDû;
	}
}
