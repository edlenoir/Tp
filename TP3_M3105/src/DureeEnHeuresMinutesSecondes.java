public class DureeEnHeuresMinutesSecondes implements Duree, Comparable<DureeEnHeuresMinutesSecondes> {
	
	private int heures;
	private int minutes;
	private int secondes;
	
	public DureeEnHeuresMinutesSecondes(int heures, int minutes, int secondes) throws IllegalArgumentException {
		if (heures < 0) {
			throw new IllegalArgumentException("Heures invalides");
		}
		if (minutes < 0 || minutes > 59) {
			throw new IllegalArgumentException("Minutes invalides");
		}
		if (secondes < 0 || secondes > 59) {
			throw new IllegalArgumentException("Secondes invalides");
		}
		this.heures = heures;
		this.minutes = minutes;
		this.secondes = secondes;
	}
	
	public void plusUneMinute() {
		if(this.minutes<59) {
		this.minutes++;
		}
		else {
			this.heures++;
			this.minutes = 0;
		}
		
	}
	public void plusUneHeure() {
		this.heures++;
	}
	public int getHeures() {
		return this.heures;
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	
	public int getSecondes() {
		return this.secondes;
	}
	
	
	public void ajouterUneSeconde() {
		if (this.secondes < 59) {
			this.secondes++;
		}
		else {
			this.secondes = 0;
			if (this.minutes < 59) {
				this.minutes++;
			}
			else {
				this.minutes = 0;
				this.heures++;
			}
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) 
			return false;
		if (this == obj) 
			return true;
		if (! (obj instanceof DureeEnHeuresMinutesSecondes))
			return false;
		DureeEnHeuresMinutesSecondes d = (DureeEnHeuresMinutesSecondes) obj;
		return this.heures == d.heures && this.minutes == d.minutes && this.secondes == d.secondes;
	}
	
	@Override
	public int hashCode() {
		return this.heures + this.minutes + this.secondes;
	}
	
	@Override
	public String toString() {
		return this.getHeures() + ":" + this.getMinutes() + ":" + this.getSecondes();
	}
	
	public int compareTo(DureeEnHeuresMinutesSecondes d) {
		return (this.heures * 3600 + this.minutes * 60 + this.secondes) - 
				(d.heures * 3600 + d.minutes * 60 + d.secondes);
	}
}
