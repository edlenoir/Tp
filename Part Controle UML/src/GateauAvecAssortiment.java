
public abstract class GateauAvecAssortiment extends Gateau{

	private Gateau gateau;

	public GateauAvecAssortiment(Gateau gateau) {
		super();
		this.gateau = gateau;
	}
	
	
	public Gateau getGateau() {
		return this.gateau;
	}
	

	public abstract String getDesignation();
	
	public abstract float getPrix() ;

}
