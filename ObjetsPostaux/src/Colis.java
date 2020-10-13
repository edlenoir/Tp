
public class Colis {
	private String origine ;
	private String destination ;
	private int cp;
	private float volume;
	private float poids;
	private int reco;

public Colis(String origine, String destination, int cp, float volume, float poids,int reco) {
		
		this.origine = origine;
		this.destination = destination;
		this.cp = cp;
		this.poids = poids;
		this.volume = volume;
		this.reco = reco;
		
}

public float tarifAffranchissement() {
	final float tarifDeBase = 2F;
	final float tarifDe1 = 2.5F;
	final float tarifDe2 = 3.5F;
	float i=tarifDeBase;
	if (reco == 1)
		i+=tarifDe1;
	if (reco == 2)
		i+=tarifDe2;
	return i;
}
	
}
