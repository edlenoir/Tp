import java.util.List;

public class CalculatorBillets5 extends CalculatorBillets {
	public void donnerBillets(WrapperMontant wrapper, List<Couple> proposition,EtatDistributeur etat) {
		int montant = wrapper.getMontant();
		if (montant >= 20 && montant < 100) {
			int nBillets5 = Math.min((int)Math.ceil(montant/2/50),etat.getNb5Disponible());
			montant -= nBillets5*5;
			etat.setNb5Disponible(etat.getNb5Disponible() - nBillets5);
			if (nBillets5 > 2) {
				proposition.add(new Couple(5,nBillets5));
				proposition.add(new Couple(5,nBillets5));
			}
		}
		wrapper.setMontant(montant);
		super.donnerBillets(wrapper, proposition, etat);
	}
}


