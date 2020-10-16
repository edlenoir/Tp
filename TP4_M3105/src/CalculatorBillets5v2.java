import java.util.List;

public class CalculatorBillets5v2 extends CalculatorBillets {
	public void donnerBillets(WrapperMontant wrapper, List<Couple> proposition, EtatDistributeur etat) {
        int montant = wrapper.getMontant();
        if (montant > 0) {
            int nBillets5 = Math.min(montant/5 , etat.getNb5Disponible());
            if (nBillets5 > 0) { 
            	etat.setNb5Disponible(etat.getNb5Disponible() - nBillets5);
                Couple couple = new Couple(5,nBillets5);
                proposition.add(couple);
                wrapper.setMontant(wrapper.getMontant() - couple.getNombreBilletsDelivres() * couple.valeurBillet);
            }
        }
        super.donnerBillets(wrapper, proposition, etat);
    }

	}


