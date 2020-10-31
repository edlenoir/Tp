
public class Achat {
	private String libelle; // Libell� de l'article
	private int nbArticles; // Quantit� de cet article achet�
	private float prixUnitaire; // Prix unitaire de cet article
/**
* Constructeur
* @param lib libelle de l'article
* @param prix prix unitaire de l'article
* @param nb Qt� de cet article achet�e
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
* @return le libell� de l'article
*/
	public String getLibelle(){
		return this.libelle;
}
/**
* @return la quantit� achet�e pour cet article
*/
	public int getQte(){
		return this.nbArticles;
	}
}