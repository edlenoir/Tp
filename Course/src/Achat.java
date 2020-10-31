
public class Achat {
	private String libelle; // Libellé de l'article
	private int nbArticles; // Quantité de cet article acheté
	private float prixUnitaire; // Prix unitaire de cet article
/**
* Constructeur
* @param lib libelle de l'article
* @param prix prix unitaire de l'article
* @param nb Qté de cet article achetée
*/
	public Achat(String lib, float prix, int nb){
		this.libelle = lib;
		this.prixUnitaire = prix;
		this.nbArticles = nb;
}
/**
* @return le prix unitaire de l'article
*/
	public float getPrixUnitaire(){
		return this.prixUnitaire;
}
/**
* @return le libellé de l'article
*/
	public String getLibelle(){
		return this.libelle;
}
/**
* @return la quantité achetée pour cet article
*/
	public int getQte(){
		return this.nbArticles;
	}
}