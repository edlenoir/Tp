import java.util.List;

public class CalculatorBillets20 extends CalculatorBillets {
	public void donnerBillets(WrapperMontant wrapper, List<Couple> proposition,EtatDistributeur etat) {
		int montant = wrapper.getMontant();
		if (montant > 20) { 
			int nBillets20 = 0;
			if (montant % 20 == 0) {
				nBillets20 = montant / 20 -1;
			}
			else {
				nBillets20 = montant / 20;
			}
			nBillets20 = Math.min(nBillets20, etat.getNb20Disponible());
			montant -= nBillets20*20;
			etat.setNb20Disponible(etat.getNb20Disponible() - nBillets20);
			proposition.add(new Couple(20,nBillets20));
		}
		wrapper.setMontant(montant);
		super.donnerBillets(wrapper, proposition, etat);


	}

}
