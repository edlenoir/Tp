import java.util.List;
public abstract class CalculatorBillets {
	private CalculatorBillets suivant;
	
	public void donnerBillets(WrapperMontant wrapper, List<Couple> proposition, EtatDistributeur etat) {
		if(this.suivant != null) {
			this.suivant.donnerBillets(wrapper, proposition, etat);
		}
	}
	public void setSuivant(CalculatorBillets suivant) {
		this.suivant = suivant;
	}

 }
