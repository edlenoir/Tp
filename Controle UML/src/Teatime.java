public class Teatime {
	
	public static void main(String[] args) {
		Gateau g1 = new Muffin();
		System.out.println(g1);
		Gateau g2 = new Cupcake();
		g2 = new AssortimentChocolat(g2);
		System.out.println(g2);
		Gateau g3 = new Cupcake();
		g3 = new AssortimentChocolat(g3);
		g3 = new AssortimentChantilly(g3);
		System.out.println(g3);
		float total = g1.getPrix() + g2.getPrix() + g3.getPrix();
		System.out.println("Total = " + total + " €");
	}

}
