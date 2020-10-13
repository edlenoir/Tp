
public class CupcakeChocolat implements Choix {
	
	public Gateau creerGateau() {
		Gateau cc =new Cupcake();
		return new AssortimentChocolat(cc);
	}
	
	

}
