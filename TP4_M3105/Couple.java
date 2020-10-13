package atm;

public class Couple {
	
	int valeurBillet;
	int nombreBilletsDélivrés;
	
	public Couple(int valeurBillet, int nombreBilletsDélivrés) {
		this.valeurBillet = valeurBillet;
		this.nombreBilletsDélivrés = nombreBilletsDélivrés;
	}

	public int getValeurBillet() {
		return valeurBillet;
	}

	public int getNombreBilletsDélivrés() {
		return nombreBilletsDélivrés;
	}
	
	public String toString() {
		return ("" + this.nombreBilletsDélivrés + " * " + this.valeurBillet);
	}
}
