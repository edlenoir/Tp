import java.util.List;

public class CalculatorBillets10v2 extends CalculatorBillets{
	public void donnerBillets(WrapperMontant wrapper, List<Couple> proposition, EtatDistributeur etat) {
        int montant = wrapper.getMontant();
        if (montant > 0) {
            int nBillets10 = Math.min(montant/10 , etat.getNb10Disponible());
            if (nBillets10 > 0) { 
            	etat.setNb10Disponible(etat.getNb10Disponible() - nBillets10);
                Couple couple = new Couple(10,nBillets10);
                proposition.add(couple);
                wrapper.setMontant(wrapper.getMontant() - couple.getNombreBilletsDelivres() * couple.valeurBillet);
            }
        }
        super.donnerBillets(wrapper, proposition, etat);
    }
}