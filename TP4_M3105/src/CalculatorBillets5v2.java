import java.util.List;

public class CalculatorBillets5v2 extends CalculatorBillets {
	public void donnerBillets(WrapperMontant wrapper, List<Couple> proposition,EtatDistributeur etat) {
		  int nbBillets = 0;
	        int montant = wrapper.getMontant();
	        if (montant > 20 && montant < 100) {
	            if (etat.getNb5Disponible() >= 2)
	                nbBillets = 2;
	            else
	                nbBillets = etat.getNb5Disponible();
	            if (nbBillets > 0) {
	                Couple couple = new Couple(5, nbBillets);
	                proposition.add(couple);
	                wrapper.setMontant(wrapper.getMontant() - couple.nombreBilletsDélivrés * couple.valeurBillet);
	            }
	        }
	        super.donnerBillets(wrapper, proposition, etat);
	    }

	}


