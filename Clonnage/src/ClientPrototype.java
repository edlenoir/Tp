
public class ClientPrototype {

	public static void main(String[] args) {
		Personne moi = new Personne(new Patronyme("Leblanc","Hervé"),57);
		System.out.println(moi);
		Personne arthur = moi.clone();
		//Clonage d'arthur par rapport a sont pere
		System.out.println(arthur);
		arthur.setAge(30);
		arthur.getPatronyme().setPrenom("Arthur");
		System.out.println(arthur);
		System.out.println(moi);
		// Clonage de Vincent par rapport a Arthur
		Personne vincent = arthur.clone();
		vincent.getPatronyme().setPrenom("Vincent");
		System.out.println(vincent);
		System.out.println(arthur);
		System.out.println(moi);

				

	}

}
