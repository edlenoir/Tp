
public class NbNs {
	private int exposant;
	private double mantisse;

	
	/**
	 * @param exposant
	 * @param mantisse
	 * @throws IllegalArgumentException se lance que si la mantisse n'est pas dans l'intervalle 2<Mantisse<10
	 */
	public NbNs( double mantisse,int exposant)throws IllegalArgumentException {
		if(mantisse < 1.0 || mantisse >= 10.0)
			throw new IllegalArgumentException();
		this.exposant = exposant;
		this.mantisse = mantisse;
	}
	public NbNs (double mantisse ) throws IllegalArgumentException{
		if (mantisse<=0)
			throw new IllegalArgumentException();
				 this.mantisse= mantisse;
				 this.exposant=0;
				while(this.mantisse<1) {
					this.mantisse= this.mantisse*10;
					this.exposant= this.exposant-1;
					}
				while (this.mantisse>10) {
					this.mantisse= this.mantisse/10;
					this.exposant= this.exposant + 1;
					}
	}

	public int getExposant() {
		return this.exposant;
	}


	public double getMantisse() {
		return this.mantisse;
	}

	public NbNs ordreGrandeur() {
		if (this.mantisse>5)
			return new NbNs (1,this.exposant+1);
		else
			return new NbNs (1,this.exposant);
	}
	
	public NbNs produit (NbNs m ) {
		if (this.mantisse*m.mantisse<10)
			return new NbNs(this.mantisse*m.mantisse,this.exposant+m.exposant);
		else if(this.mantisse*m.mantisse>10);
			return new NbNs ((this.mantisse*m.mantisse)/10,this.exposant+ m.exposant+ 1);
			
		
	}

	@Override
	public String toString() {
		if (this.exposant==0)
			return(""+this.mantisse);
		else if(this.exposant<0)
			return(""+this.mantisse + "E"+this.exposant);
		else 
			return(""+this.mantisse +"E+"+this.exposant);
	}
	
	
	
	
	
}
