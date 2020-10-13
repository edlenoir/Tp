
public class Lettre {
	private String origine ;
	private String destination ;
	private int cp;
	private float volume;
	private float poids;
	private int reco;
	private boolean urg;
	
	public Lettre(String origine, String destination, int cp, float volume, float poids,int reco,boolean urg) {
		
		this.origine = origine;
		this.destination = destination;
		this.cp = cp;
		this.poids = poids;
		this.volume = volume;
		this.reco = reco;
		this.urg= urg;
	}

	public float tarifAffranchissement() {
		final float tarifDeBase = 0.5F;
		final float tarifCaractereUrgence = 0.3F;
		float i=tarifDeBase;
		if (urg) 
			i+=tarifCaractereUrgence;
		if (reco == 1)
			i+=0.5F;
		if (reco == 2)
			i+=1.5F;
	return i;
}
	private String caractereUrgence() {
		 if (this.urg) {
		 return "urgent";
		 } else {
		 return "ordinaire";
		 }
}
	public float tarifRemboursement() {
		if (reco == 1)
			return 1.5F;
		if (reco == 2)
			return 15F;
		return 0F;
	}
	
	
	@Override
	public String toString() {
		return "Lettre [" + this.cp +"/" + this.destination +"/"  +this.reco +"/" + caractereUrgence() +"]";
	}
	
}
