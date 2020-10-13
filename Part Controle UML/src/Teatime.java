public class Teatime {
	
	public static void main(String[] args) {
		Gateau g1 = new MuffinNature().creerGateau();
		System.out.println(g1);
		Gateau g2 = new CupcakeChocolat().creerGateau();
		System.out.println(g2);
		Gateau g3 = new CupcakeChocolatChantilly().creerGateau();
		System.out.println(g3);
		float total = g1.getPrix() + g2.getPrix() + g3.getPrix();
		System.out.println("Total = " + total + " €");
	}

}
