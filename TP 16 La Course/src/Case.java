public abstract class Case {
    
    private int numero;

    public Case(int numero) {
        this.numero = numero;
    }

    public abstract int calculDeplacement(int valeurDé);
    
    public int getNumero() {
		return this.numero;
	}
    @Override
	public String toString() {
		return "";
	}
}