
public class AssortimentChocolat extends GateauAvecAssortiment {
	
	public AssortimentChocolat(Gateau gateau) {
		super(gateau);
	}
	
	
	public String getDesignation() {
		return  getGateau() + ", Chocolat" ;
	}
	
	public  float getPrix() {
		return  0.5F;
	}

}
