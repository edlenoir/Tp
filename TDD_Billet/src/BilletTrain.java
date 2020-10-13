public class BilletTrain {
	private float distance;
	public static final float[] DISTANCE = {2F, 25F, 50F, 100F, 150F, 300F, Float.MAX_VALUE};
	public static final int[] BAREMEBORD = {10, 15, 25, 35, 60, 90};
	public static final int[] BAREMECONTROLE = {50, 50, 50, 50, 90, 120};

	
	public BilletTrain (float distance) throws IllegalArgumentException {
		if (distance<= 2F)
			throw new IllegalArgumentException("La distance est trop petite");
		this.distance = distance;
	}

	public int getTarif(boolean honnete) {
		
	if (this.distance <=DISTANCE[1]) {
		
		if (honnete)
			return BAREMEBORD[0];
		else
			return BAREMECONTROLE[0];
	}
	if (this.distance>DISTANCE[1] && this.distance <=DISTANCE[2]) {
		
		if (honnete)
			return BAREMEBORD[1];
		else
			return BAREMECONTROLE[1];			
	}
	if (this.distance>DISTANCE[2] && this.distance <=DISTANCE[3]) {
		if (honnete)
			return BAREMEBORD[2];
		else
			return BAREMECONTROLE[2];	
	}
	if (this.distance>DISTANCE[3] && this.distance <=DISTANCE[4]) {
		if (honnete)
			return BAREMEBORD[3];
		else
			return BAREMECONTROLE[3];	
	}
	if (this.distance>DISTANCE[4] && this.distance <=DISTANCE[5]) {
		if (honnete)
			return BAREMEBORD[4];
		else
			return BAREMECONTROLE[4];	
	}
	if (this.distance >DISTANCE[5]) {
		if (honnete)
			return BAREMEBORD[5];
		else
			return BAREMECONTROLE[5];	
	}
	
	return 0;
 }
	
	public int getTarifAvecTable(int[] tableTarif) {
		int i = 0;
		while (i<tableTarif.length) {
			if (this.distance<=DISTANCE[i+1])
				return tableTarif[i];
			i++;
		}
		return 0;
	}
}
