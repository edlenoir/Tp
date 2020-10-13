import java.util.List;

public class CalculatorBillets50 extends CalculatorBillets{
	public void donnerBillets(WrapperMontant wrapper, List<Couple> proposition,EtatDistributeur etat) {
		int montant = wrapper.getMontant();
		if (montant > 20 && montant < 100) {
			int nBillets50 = Math.min((int)Math.ceil(montant/2/50),etat.getNb50Disponible());
			montant -= nBillets50*50;
			etat.setNb50Disponible(etat.getNb50Disponible() - nBillets50);
			if (nBillets50 > 0) {
				proposition.add(new Couple(50,nBillets50));
			}
		}
		wrapper.setMontant(montant);
		super.donnerBillets(wrapper, proposition, etat);
	}
}
