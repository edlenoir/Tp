
public class CakeStore {

	public static void main(String[] args) {

		/* La preparation de base */
		CheeseCake cake = new CheeseCake();
		cake.addSugar("100g");
		cake.addButter("200g");
		cake.addCheese("Acapella");

		RecapDay journal = RecapDay.getJournalOfTheDay();
		
		/* Une commande classique avec un nom de client */
		CheeseCake cake1 = (CheeseCake) cake.prepareCake();
		cake1.setCustomer("Bastien");
		journal.addNewOrder(cake1);
		
		/* Une commande  avec un formage particulier */
		CheeseCake cake2 = (CheeseCake) cake.prepareCake();
		cake2.addCheese("Extra Cheese");
		cake2.setCustomer("Adams");
		journal.addNewOrder(cake2);
		
		/* Une commande tres sucré*/
		CheeseCake cake3 = (CheeseCake) cake.prepareCake();
		cake3.setCustomer("Claire");
		cake3.addSugar("175g");
		journal.addNewOrder(cake3);
		
		/* Une commande tres lourde a digerer */
		CheeseCake cake4 = (CheeseCake) cake.prepareCake();
		cake4.setCustomer("Fat");
		cake4.addButter("300g");
		journal.addNewOrder(cake4);
		
		/* Editing Recap of the Day */
		System.out.println(journal);
	}
	
}