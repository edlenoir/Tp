
public class CaseTp extends Case{
	
	private int  valeurTp;
	private int valeurAttendue;

	public CaseTp(int numero,int valeurAttendue,int valeurTp) {
		super(numero);
		this.valeurTp = valeurTp;
		this.valeurAttendue=valeurAttendue;
	}
	
	public int calculDeplacement(int val) {
		if (val == valeurAttendue) 
			return this.valeurTp-this.getNumero();
		else
			return val;
		}

	@Override
	public String toString() {
		return "CaseTp [valeurTp=" + valeurTp + ", valeurAttendue=" + valeurAttendue + "]";
	}

	
}

	
	


