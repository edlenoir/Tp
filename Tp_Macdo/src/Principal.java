
public class Principal extends Item {

	
	public static final Principal Big_Mac = new Principal("Big Mac",4.25F);
	public static final Principal Royal_Deluxe = new Principal("Royal de Luxe",4.90F);
	public static final Principal Royal_Cheese = new Principal("Royal Cheese",4.15F);
	public static final Principal Royal_Bacon = new Principal("Royal Bacon",4.15F);
	public static final Principal Original_280 = new Principal("280 Original",4.95F);
	public static final Principal Mac_Wrap_Poulet_Crudites = new Principal("Mac Wrap Poulet Crudites",5.05F);
	public static final Principal Mac_Wrap_Poulet_Bacon = new Principal("Mac Wrap Poulet et Bacon",5.15F);
	public static final Principal Chicken_Caesar = new Principal("Salade Chicken Caesar",5.05F);
	public static final Principal Italian_Moza = new Principal("Salade Italienne avec Mozarella",5.20F);
	
	public Principal(String nom, float prix) {
		super(nom,prix);
	}
}
