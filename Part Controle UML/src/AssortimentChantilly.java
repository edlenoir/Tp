
public class AssortimentChantilly extends GateauAvecAssortiment {
	
	public AssortimentChantilly(Gateau gateau) {
		super(gateau);
	}
	
	
	public  String getDesignation() {
		return  this.getGateau().getDesignation() + ", Chantilly";
	}
	
	public  float getPrix() {
		return this.getGateau().getPrix() + 0.5F;
	}

}
