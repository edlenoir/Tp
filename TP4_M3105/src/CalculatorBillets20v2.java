import java.util.List;

public class CalculatorBillets20v2 extends CalculatorBillets {
	public void donnerBillets(WrapperMontant wrapper, List<Couple> proposition, EtatDistributeur etat) {
        int montant = wrapper.getMontant();
        if (montant > 0) {
            int nBillets20 = Math.min(montant/20 , etat.getNb20Disponible());
            if (nBillets20 > 0) { 
            	etat.setNb20Disponible(etat.getNb20Disponible() - nBillets20);
                Couple couple = new Couple(20,nBillets20);
                proposition.add(couple);
                wrapper.setMontant(wrapper.getMontant() - couple.getNombreBilletsDelivres() * couple.valeurBillet);
            }
        }
        super.donnerBillets(wrapper, proposition, etat);
    }

}
