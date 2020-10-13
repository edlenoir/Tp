package Journalisation;

public class CompteBancaire {
	private int numero;
	private double solde;


	public CompteBancaire(int numero) {
		this.numero = numero;
		this.solde = 0.0;
		
	}

	public void d�poser(double montant) {
		if (montant > 0.0) {
			solde += montant;
			Journal.getInstance1().ajouterLog("D�p�t de " + montant + "� sur le compte " + numero + ".");
		} else {
			Journal.getInstance2().ajouterLog("/!\\ D�p�t d'une valeur n�gative impossible (" + numero+ ").");
		}
	}
	
	public void retirer(double montant) {
		if (montant > 0.0) {
			if (solde >= montant) {
				solde -= montant;
				Journal.getInstance1().ajouterLog("Retrait de " + montant + "� sur le compte " + numero+ ".");
			} else {
				Journal.getInstance2().ajouterLog("/!\\ La banque n'autorise pas de d�couvert (" + numero+ ").");
			}
		} else {
			Journal.getInstance2().ajouterLog("/!\\ Retrait d'une valeur n�gative impossible (" + numero+ ").");
		}
	}
	
}
