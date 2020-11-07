
public class Accompagnement extends Item {
	

	public static final Accompagnement Frites = new Accompagnement("Frites",1.20F);
	public static final Accompagnement Potates = new Accompagnement("Potates",1.25F);
	public static final Accompagnement Petite_Salade = new Accompagnement("Petite Salade",0.95F);
	
	public Accompagnement(String nom, float prix) {
		super(nom,prix);
	}

}
