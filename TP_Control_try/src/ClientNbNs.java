
public class ClientNbNs {

	public static void main(String[] args) {
		NbNs x = new NbNs (5.06,15);
		NbNs y = new NbNs (3.2,-5);
		NbNs z = new NbNs (5455);
		NbNs t = new NbNs (0.000787);
		System.out.println("Ordre de grandeur de 5.06 E+15 = "+x.ordreGrandeur());
		System.out.println("Ordre de grandeur de 3.2 E-5 = "+y.ordreGrandeur());
		System.out.println("Produit de 5.06 E+15 et 3.2 E-5 =" +x.produit(y) );
		System.out.println("3.2 E-5 à la puissance 5 =" +y.produit(y.produit(y.produit(y.produit(y)))) );
		System.out.println("Le réel 0.000787 permet d’obtenir le nombre en notation scientifique"+t);
		System.out.println("Le réel 5455 permet d’obtenir le nombre en notation scientifique"+z);
	}

}
