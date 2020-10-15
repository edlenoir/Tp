import java.util.List;

public class CalculatorBillets10v2 extends CalculatorBillets{
	public void donnerBillets(WrapperMontant wrapper, List<Couple> proposition,EtatDistributeur etat) {
		int montant = wrapper.getMontant();
		if (montant > 0) {
			int nBillets10 = Math.min(montant/10, etat.getNb10Disponible());
			montant -= nBillets10*10;
			etat.setNb10Disponible(etat.getNb10Disponible() - nBillets10);
			proposition.add(new Couple(10,nBillets10));
			wrapper.setMontant(montant);
			super.donnerBillets(wrapper, proposition, etat);
		}

	}
}