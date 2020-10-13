import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ApplicationRefuge {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Animal> animauxRéfugiés = new LinkedList<Animal>();
		RefugeAnimal refuge = new RefugeAnimal(animauxRéfugiés);
		
		System.out.println("Bonjour, vous souhaitez adopter un animal?");
		String reponse = sc.nextLine().toLowerCase();
		while (reponse.equals("oui")) {
			System.out.println("Quel animal souhaitez vous adopter? Il peut y avoir des 'Chien', 'Chat', 'Perruche' ou 'Perroquet'");
			String reponse2 = sc.nextLine();
			System.out.println(refuge.presenceAnimal(reponse2));
			for (int i = 0; i<refuge.getAnimauxRéfugiés().size(); i++) {
				if (refuge.getAnimauxRéfugiés().get(i).typeAnimal().equals(reponse2)) {
					System.out.println(refuge.getAnimauxRéfugiés().get(i).toString());
				}
			}
			System.out.println("Voulez vous interragir avec un "+reponse2+"?");
			reponse = sc.nextLine().toLowerCase();
			while (reponse.equals("oui")) {
				if (reponse2.equals("Chat")) {
					System.out.println("Avec quel Chat voulez vous interragir?");
					String reponse3 = sc.nextLine();
					System.out.println("Super ! Vous pouvez 'Carresser' le chat.");
					reponse = sc.nextLine();
					for (int i = 0; i<refuge.getAnimauxRéfugiés().size(); i++) {
						if (refuge.getAnimauxRéfugiés().get(i).getNom().equals(reponse3)) {
							System.out.println(refuge.getAnimauxRéfugiés().get(i).interragirAnimal(reponse));
						}
					}
				}
				if (reponse2.equals("Chien")) {
					System.out.println("Avec quel chien voulez vous interragir?");
					String reponse3 = sc.nextLine();
					System.out.println("Super ! Vous pouvez 'Carresser' ou 'Lancer une balle' au chien, que souhaitez vous faire?");
					reponse = sc.nextLine();
					for (int i = 0; i<refuge.getAnimauxRéfugiés().size(); i++) {
						if (refuge.getAnimauxRéfugiés().get(i).getNom().equals(reponse3)) {
							System.out.println(refuge.getAnimauxRéfugiés().get(i).interragirAnimal(reponse));
						}
					}
				}
				if (reponse2.equals("Perroquet")) {
					System.out.println("Avec quel perroquet voulez vous interragir?");
					String reponse3 = sc.nextLine();
					System.out.println("Super ! Vous pouvez parler au perroquet");
					reponse = sc.nextLine().toLowerCase();
					for (int i = 0; i<refuge.getAnimauxRéfugiés().size(); i++) {
						if (refuge.getAnimauxRéfugiés().get(i).getNom().equals(reponse3)) {
							System.out.println(refuge.getAnimauxRéfugiés().get(i).interragirAnimal(reponse));
						}
					}
				}
				if (reponse2.equals("Perruche")) {
					System.out.println("Avec quel perruche voulez vous interragir?");
					String reponse3 = sc.nextLine();
					System.out.println("Super ! Vous pouvez 'Siffloter'");
					reponse = sc.nextLine();
					for (int i = 0; i<refuge.getAnimauxRéfugiés().size(); i++) {
						if (refuge.getAnimauxRéfugiés().get(i).getNom().equals(reponse3)) {
							System.out.println(refuge.getAnimauxRéfugiés().get(i).interragirAnimal(reponse));
						}
					}
				}
				System.out.println("Voulez vous interragir avec un autre "+reponse2+"?");
				reponse = sc.nextLine().toLowerCase();
			}
			System.out.println("Quel "+reponse2+" souhaitez vous adopter?");
			reponse = sc.nextLine();
			for (int i = 0; i<refuge.getAnimauxRéfugiés().size(); i++) {
				if (refuge.getAnimauxRéfugiés().get(i).getNom().equals(reponse)) {
					System.out.println("Félicitation, vous avez adopté "+reponse+" !");
					refuge.getAnimauxRéfugiés().remove(i);
				}
			}
			System.out.println("Voici les animaux présents actuellement dans le refuge : ");
			for (int i = 0; i<refuge.getAnimauxRéfugiés().size(); i++) {
				System.out.print("Le "+refuge.getAnimauxRéfugiés().get(i).typeAnimal()+" : ");
				System.out.println(refuge.getAnimauxRéfugiés().get(i).getNom());
			}
			System.out.println("Voulez vous adopter un autre animal?");
			reponse = sc.nextLine().toLowerCase();
		}
		System.out.println("Passez une bonne journée.");
	}

}