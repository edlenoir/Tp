
public abstract class Gateau {
	
	
	private String designation;
	private float prix;
		
	public String getDesignation() {
		return designation;
	}
	
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public float getPrix() {
		return prix;
	}
	
	
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
	
	@Override
	public String toString() {
		return "" + designation + ":" + prix + "€";
	}
	
	
}
