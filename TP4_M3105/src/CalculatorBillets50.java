import java.util.List;

public class CalculatorBillets50 extends CalculatorBillets{
	public void donnerBillets(WrapperMontant wrapper, List<Couple> proposition, EtatDistributeur etat) {
        int montant = wrapper.getMontant();
        if (montant > 50) {
            int nBillets50 = Math.min((int)Math.ceil(montant/2/50), etat.getNb50Disponible());
            etat.setNb50Disponible(etat.getNb50Disponible() - nBillets50);
            if (nBillets50 > 0) {
                Couple couple = new Couple(50,nBillets50);
                proposition.add(couple);
                wrapper.setMontant(wrapper.getMontant() - couple.getNombreBilletsDelivres() * couple.valeurBillet);
            }
        }
        super.donnerBillets(wrapper, proposition, etat);
    }
}
