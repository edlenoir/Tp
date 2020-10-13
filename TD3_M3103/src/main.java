
public class main {

	public static void main(String[] args) throws ContactVide {
		Gestionnaire g = new Gestionnaire();
		Contact c1 = new Contact("florian","Lombard","0000000");
		Contact c2 = new Contact("Nath","Gey","03942049");
		Contact c3 = new Contact("Jo","Bonnefoi","03123456");
		Contact c4 = new Contact("Luc","Castamagna","5467890");
		g.ajouterContact(g,c1);
		g.ajouterContact(g,c2);
		g.ajouterContact(g, c3);
		g.ajouterContact(g, c4);
		System.out.println(g.rechercherContact("Lombard", "florian"));

	}

}
