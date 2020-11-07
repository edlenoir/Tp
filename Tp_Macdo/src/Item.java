
public abstract class Item implements Cloneable {
	
	private String nom;
	private float prix;
	
	
	public Item (String nom, float prix) {
		this.nom = nom;
		this.prix = prix;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	public Item clone() {
		try {
			Item copy = (Item)super.clone();
			return copy;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	@Override
	public String toString() {
		return "Item [nom=" + nom + ", prix=" + prix + "]";
	}
	
}
