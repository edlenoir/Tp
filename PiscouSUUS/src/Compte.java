
public class Compte {
	private float debit;
	private float credit;
	
	public Compte(float debit, float credit) {
		super();
		this.debit =0.0F;
		this.credit = 0.0F;
	}
	
	public float solde() {
		return (this.credit - this.debit);
	}


	public void deposer(float montant) {
		this.credit = credit + montant;
	}

	public void retirer(float montant) {
		this.debit = debit - montant;
	}
	
	
	
}
