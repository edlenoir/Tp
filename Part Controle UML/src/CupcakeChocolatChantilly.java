
public class CupcakeChocolatChantilly implements Choix {

	public Gateau creerGateau() {
		Gateau ccc = new Cupcake();
		return new AssortimentChocolat((new AssortimentChantilly(ccc)));
	}
	


}


