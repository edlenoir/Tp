public class CaseAttente extends Case {
    
    private int valeurAttendue;
    
    public CaseAttente(int numero, int valeurAttendue) {
        super(numero);
        this.valeurAttendue = valeurAttendue;
    }
    
    public int calculDeplacement(int valeurDé) {
        if (valeurDé != this.valeurAttendue)
            return 0;
        else
            return this.valeurAttendue;
    }
    
    @Override
	public String toString() {
		return super.toString() + "[case n°" + this.getNumero() + "] :  avancer de la valeur du dé si elle est égale à " + this.valeurAttendue;
	}

}