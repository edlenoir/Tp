
public class Boisson extends Item {
	
	public static final Boisson Coca = new Boisson("Coca Cola",1.25F);
	public static final Boisson Coca_Light = new Boisson("Coca Cola Light",1.25F);
	public static final Boisson Badoit = new Boisson("Badoit",0.80F);
	public static final Boisson Evian = new Boisson("Evian",0.80F);
	public static final Boisson Ice_Tea = new Boisson("Lipton Ice Tea",1.50F);
	public static final Boisson Fanta = new Boisson("Fanta",1.25F);
	
	public Boisson(String nom, float prix) {
		super(nom, prix);
	}

}
