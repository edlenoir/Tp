public class CaseNormale extends Case {

    public CaseNormale(int numero) {
        super(numero);
    }

    @Override
    public int calculDeplacement(int valeurD�) {
        return valeurD�;
    }
    @Override
	public String toString() {
		return super.toString() + "[case n�" + this.getNumero() + "] :  avancer de la valeur du d� ";
	}

	


}