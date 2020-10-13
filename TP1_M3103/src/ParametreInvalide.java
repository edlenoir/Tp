
public class ParametreInvalide extends Exception {
	private String raisonErreur;

	public ParametreInvalide(String raisonErreur,String libelleErreur) {
		super(libelleErreur);
		this.raisonErreur = raisonErreur;
	}
	
	
	
}
