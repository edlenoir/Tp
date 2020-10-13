public class DureeEnSecondes implements Duree, Comparable<DureeEnSecondes> {
	
	private int secondes;
	
	public DureeEnSecondes(int heures, int minutes, int secondes) throws IllegalArgumentException {
		if (heures < 0) {
			throw new IllegalArgumentException("Heures invalides");
		}
		if (minutes < 0 || minutes > 59) {
			throw new IllegalArgumentException("Minutes invalides");
		}
		if (secondes < 0 || secondes > 59) {
			throw new IllegalArgumentException("Secondes invalides");
		}
		this.secondes = this.versSecondes(heures, minutes, secondes);
	}
	
	private int versSecondes(int h, int m, int s) {
		return h * 3600 + m * 60 + s;
	}
	
	/* (non-Javadoc)
	 * @see Duree#getHeures()
	 */
	@Override
	public int getHeures() {
		return this.secondes / 3600;
	}
		
	/* (non-Javadoc)
	 * @see Duree#getMinutes()
	 */
	@Override
	public int getMinutes() {
		return (this.secondes % 3600) / 60;
	}
		
	
	/* (non-Javadoc)
	 * @see Duree#getSecondes()
	 */
	@Override
	public int getSecondes() {
		return this.secondes % 60;
	}
	
	public void plusUneMinute() {
		this.secondes+=60;
	}
	public void plusUneHeure() {
		this.secondes += 3600; 
	}
	
	
	
	/* (non-Javadoc)
	 * @see Duree#ajouterUneSeconde()
	 */
	@Override
	public void ajouterUneSeconde() {
		this.secondes++;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) 
			return false;
		if (this == obj) 
			return true;
		if (! (obj instanceof DureeEnSecondes)) 
			return false;
		DureeEnSecondes d = (DureeEnSecondes) obj;
		return (this.secondes == d.secondes);
	}
		
	@Override
	public int hashCode() {
		return this.secondes;
	}
	
	@Override
	public String toString() {
		return this.getHeures() + ":" + this.getMinutes() + ":" + this.getSecondes();
	}
	
	public int compareTo(DureeEnSecondes d) {
		return this.secondes - d.secondes;
	}
	
}
