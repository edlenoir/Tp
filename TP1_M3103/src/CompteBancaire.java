
public abstract class CompteBancaire {
	private String libelle;
	private double solde;
	private Devise devise;
	private boolean debitables;
	
	public CompteBancaire(String libelle, Devise devise,boolean debitables) {
		this.libelle = libelle;
		this.devise = devise;
		this.debitables = debitables;
	}

	public double getSolde() {
		return solde;
	}

	protected void setSolde(double solde) {
		this.solde = solde;
	}

	public String getLibelle() {
		return libelle;
	}

	public Devise getDevise() {
		return devise;
	}

	@Override
	public String toString() {
		return "CompteBancaire : " + libelle + "(" + solde + " - " + devise + ")";
	}
	
	public void créditer(Couple<Devise,Double> couple) throws ParametreInvalide {
		if(couple.getV2()<= 0)
			throw new ParametreInvalide("Erreur","La valeur est inferieur a 0");
        Couple<Devise,Double> c = couple;
        if (this.devise != couple.getV1()) {
             c = OutilsFinanciers.convertir(couple, this.devise);
        }
        setSolde(this.getSolde()+c.getV2());
    }
    
    public void débiter(Couple<Devise,Double> couple)throws ParametreInvalide {
    	if(couple.getV2()<= 0)
			throw new ParametreInvalide("Erreur","La valeur est inferieur a 0");
        if (this.debitables) {
            Couple<Devise,Double> c = couple;
            if (this.devise != couple.getV1()) {
                 c = OutilsFinanciers.convertir(couple, this.devise);
            }
            setSolde(this.getSolde()-c.getV2());
        } else {
            System.out.println("Vous ne pouvez pas débiter ce compte ");
        }
    }

	
}
