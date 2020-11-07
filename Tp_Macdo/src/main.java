import java.util.LinkedList;

public class main {
	public static void main(String[] args) {
		LinkedList<Menu> commandes = new LinkedList<Menu>();
		
		// initialisation des 3 menus prototypes par le manager
		
		Menu burger = Menu.initializeMenu(Principal.Big_Mac, Accompagnement.Frites,Boisson.Coca);
		Menu wrapp = Menu.initializeMenu(Principal.Mac_Wrap_Poulet_Crudites,
		Accompagnement.Petite_Salade, Boisson.Coca);
		Menu salade = Menu.initializeMenu(Principal.Chicken_Caesar, Accompagnement.Potates, Boisson.Evian);
		
		// Prise d'une commande de type Burger avec changement de boisson
		
		Menu premiereCommande = burger.clone();
		premiereCommande.setAccompagnement(Accompagnement.Petite_Salade);
		
		// dans ce type de menu, le Big Mac s'appelle Big Mac Light
		
		premiereCommande.getPrincipal().setNom("Big Mac Light");
		commandes.add(premiereCommande);
		
		// Prise d'une commande de type Burger prototype
		
		Menu deuxiemeCommande = burger.clone();
		commandes.add(deuxiemeCommande);
		
		// Prise d'une commande de type wrapp avec changement de principal
		
		Menu troisiemeCommande = wrapp.clone();
		troisiemeCommande.setPrincipal(Principal.Mac_Wrap_Poulet_Bacon);;
		commandes.add(troisiemeCommande);
		
		// Prise d'une commande de type wrapp prototype
		
		Menu quatriemeCommande = wrapp.clone();
		commandes.add(quatriemeCommande);
		
		// Prise d'une commande de type salade avec changement de boisson
		
		Menu cinquiemeCommande = salade.clone();
		cinquiemeCommande.setBoisson(Boisson.Badoit)
		;
		// les potates sont plus chers avec la badoit
		
		cinquiemeCommande.getAccompagnement().setPrix(1.45F);
		commandes.add(cinquiemeCommande);
		
		// Prise d'une commande de type salade prototype
		
		Menu sixiemeCommande = salade.clone();
		commandes.add(sixiemeCommande);
		
		// impression
		
		int cptMenu = 1;
		for (Menu menu: commandes) {
				System.out.print("Commande " + cptMenu + " : ");
				System.out.println(menu);
				cptMenu+=1;
			}
		}

}
