import java.util.LinkedList;

public class RefugeAnimal {
	
	private LinkedList<Animal> animauxRéfugiés;
	static final Chien chien1 = new Chien("Acajou",16F,48F,"Dogo","Berger Catalan",true,3);
	static final Chien chien2 = new Chien("Blanc",25F,55F,"Dingo","Golden Retriever",false,5);
	static final Chien chien3 = new Chien("Sablé",30F,58F,"Tomy","Berger Allemand",true,4);
	static final Chien chien4 = new Chien("Blanc",25F,50F,"Fluffy","Chow-chow",true,5);
	static final Chat chat1 = new Chat("Gris",4F,30F,"Mistigri","Européen",true,2);
	static final Chat chat2 = new Chat("Roux",2F,30F,"Felix","Siamois",false,3);
	static final Perroquet perroquet1 = new Perroquet("Vert vif",0.50F,28F,"Coco","Ara ararauna",true,20);
	static final Perruche perruche1 = new Perruche("Multicolor",0.32F,33F,"Roucoul","Turquoisine",false,15);
	
	public RefugeAnimal(LinkedList<Animal> animauxRéfugiés) {
		super();
		this.animauxRéfugiés = animauxRéfugiés;
		animauxRéfugiés.add(chien1);
		animauxRéfugiés.add(chien2);
		animauxRéfugiés.add(chien3);
		animauxRéfugiés.add(chien4);
		animauxRéfugiés.add(chat1);
		animauxRéfugiés.add(chat2);
		animauxRéfugiés.add(perroquet1);
		animauxRéfugiés.add(perruche1);
	}

	public String presenceAnimal(String animal) {
		int compteur =0;
		for (int i = 0; i<animauxRéfugiés.size();i++) {
			if (this.animauxRéfugiés.get(i).typeAnimal().equals(animal)) {
				compteur+=1;
			}
		}
		return ("Nous avons actuellement "+compteur+" "+ animal+"(s).");
	}

	public LinkedList<Animal> getAnimauxRéfugiés() {
		return this.animauxRéfugiés;
	}

	public void setAnimauxRéfugiés(LinkedList<Animal> animauxRéfugiés) {
		this.animauxRéfugiés = animauxRéfugiés;
	}
	
	
}
