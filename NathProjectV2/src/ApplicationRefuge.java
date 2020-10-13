import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ApplicationRefuge {
	
	/*Les changements dans le main sont les m�mes que dans "RefugeAnimal", c'est � dire traiter du cas par cas tous les types possible de notre liste,
	lorsqu'on utilise une m�thode de classe.
	
	On observe suite � ces changement qu'�norm�ment de parties du code sont identiques, nous avons cr�� de la redondance.
	
	En conclusion, on peut donc voir que l'utilisation de l'h�ritage en java permet une factorisation du code, ce qui r�duit le nombre de lignes,
	augmentant la lisibilit� et la comp�hension de celui ci.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Object> animauxR�fugi�s = new LinkedList<Object>();  //On change ici aussi le type des �l�ments de la liste
		RefugeAnimal refuge = new RefugeAnimal(animauxR�fugi�s);
		System.out.println("Bonjour, vous souhaitez adopter un animal?");
		String reponse = sc.nextLine().toLowerCase();
		while (reponse.equals("oui")) {
			System.out.println("Quel animal souhaitez vous adopter? Il peut y avoir des 'Chien', 'Chat', 'Perruche' ou 'Perroquet'");
			String reponse2 = sc.nextLine();
			System.out.println(refuge.presenceAnimal(reponse2));
			for (int i = 0; i<refuge.getAnimauxR�fugi�s().size(); i++) {
				if (refuge.getAnimauxR�fugi�s().get(i) instanceof Chat){
					if (((Chat) refuge.getAnimauxR�fugi�s().get(i)).typeAnimal().equals(reponse2)) {
						System.out.println(refuge.getAnimauxR�fugi�s().get(i).toString());
					}
				}
				if (refuge.getAnimauxR�fugi�s().get(i) instanceof Chien){
					if (((Chien) refuge.getAnimauxR�fugi�s().get(i)).typeAnimal().equals(reponse2)) {
						System.out.println(refuge.getAnimauxR�fugi�s().get(i).toString());
					}
				}
				if (refuge.getAnimauxR�fugi�s().get(i) instanceof Perroquet){
					if (((Perroquet) refuge.getAnimauxR�fugi�s().get(i)).typeAnimal().equals(reponse2)) {
						System.out.println(refuge.getAnimauxR�fugi�s().get(i).toString());
					}
				}
				if (refuge.getAnimauxR�fugi�s().get(i) instanceof Perruche){
					if (((Perruche) refuge.getAnimauxR�fugi�s().get(i)).typeAnimal().equals(reponse2)) {
						System.out.println(refuge.getAnimauxR�fugi�s().get(i).toString());
					}
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
					for (int i = 0; i<refuge.getAnimauxR�fugi�s().size(); i++) {
						if (refuge.getAnimauxR�fugi�s().get(i) instanceof Chat) {
							if (((Chat) refuge.getAnimauxR�fugi�s().get(i)).getNom().equals(reponse3)) {
								System.out.println(((Chat) refuge.getAnimauxR�fugi�s().get(i)).interragirAnimal(reponse));
							}
						}
					}
				}
				if (reponse2.equals("Chien")) {
					System.out.println("Avec quel chien voulez vous interragir?");
					String reponse3 = sc.nextLine();
					System.out.println("Super ! Vous pouvez 'Carresser' ou 'Lancer une balle' au chien, que souhaitez vous faire?");
					reponse = sc.nextLine();
					for (int i = 0; i<refuge.getAnimauxR�fugi�s().size(); i++) {
						if (refuge.getAnimauxR�fugi�s().get(i) instanceof Chien) {
							if (((Chien) refuge.getAnimauxR�fugi�s().get(i)).getNom().equals(reponse3)) {
								System.out.println(((Chien) refuge.getAnimauxR�fugi�s().get(i)).interragirAnimal(reponse));
							}
						}
					}
				}
				if (reponse2.equals("Perroquet")) {
					System.out.println("Avec quel perroquet voulez vous interragir?");
					String reponse3 = sc.nextLine();
					System.out.println("Super ! Vous pouvez dire 'Bonjour' au perroquet");
					reponse = sc.nextLine();
					for (int i = 0; i<refuge.getAnimauxR�fugi�s().size(); i++) {
						if (refuge.getAnimauxR�fugi�s().get(i) instanceof Perroquet) {
							if (((Perroquet) refuge.getAnimauxR�fugi�s().get(i)).getNom().equals(reponse3)) {
								System.out.println(((Perroquet) refuge.getAnimauxR�fugi�s().get(i)).interragirAnimal(reponse));
							}
						}
					}
				}
				if (reponse2.equals("Perruche")) {
					System.out.println("Avec quel perruche voulez vous interragir?");
					String reponse3 = sc.nextLine().toLowerCase();
					System.out.println("Super ! Vous pouvez 'Siffloter'");
					reponse = sc.nextLine();
					for (int i = 0; i<refuge.getAnimauxR�fugi�s().size(); i++) {
						if (refuge.getAnimauxR�fugi�s().get(i) instanceof Perruche) {
							if (((Perruche) refuge.getAnimauxR�fugi�s().get(i)).getNom().equals(reponse3)) {
								System.out.println(((Perruche) refuge.getAnimauxR�fugi�s().get(i)).interragirAnimal(reponse));
							}
						}
					}
				}
				System.out.println("Voulez vous interragir avec un autre "+reponse2+"?");
				reponse = sc.nextLine().toLowerCase();
			}
			System.out.println("Quel "+reponse2+" souhaitez vous adopter?");
			reponse = sc.nextLine();
			for (int i = 0; i<refuge.getAnimauxR�fugi�s().size(); i++) {
				if (refuge.getAnimauxR�fugi�s().get(i) instanceof Chat) {
					if (((Chat) refuge.getAnimauxR�fugi�s().get(i)).getNom().equals(reponse)) {
						System.out.println("F�licitation, vous avez adopt� "+reponse+" !");
						refuge.getAnimauxR�fugi�s().remove(i);
					}
				}
				if (refuge.getAnimauxR�fugi�s().get(i) instanceof Chien) {
					if (((Chien) refuge.getAnimauxR�fugi�s().get(i)).getNom().equals(reponse)) {
						System.out.println("F�licitation, vous avez adopt� "+reponse+" !");
						refuge.getAnimauxR�fugi�s().remove(i);
					}
				}
				if (refuge.getAnimauxR�fugi�s().get(i) instanceof Perroquet) {
					if (((Perroquet) refuge.getAnimauxR�fugi�s().get(i)).getNom().equals(reponse)) {
						System.out.println("F�licitation, vous avez adopt� "+reponse+" !");
						refuge.getAnimauxR�fugi�s().remove(i);
					}
				}
				if (refuge.getAnimauxR�fugi�s().get(i) instanceof Perruche) {
					if (((Perruche) refuge.getAnimauxR�fugi�s().get(i)).getNom().equals(reponse)) {
						System.out.println("F�licitation, vous avez adopt� "+reponse+" !");
						refuge.getAnimauxR�fugi�s().remove(i);
					}
				}
			}
			System.out.println("Voici les animaux pr�sents actuellement dans le refuge : ");
			for (int i = 0; i<refuge.getAnimauxR�fugi�s().size(); i++) {
				if (refuge.getAnimauxR�fugi�s().get(i) instanceof Chat){
					System.out.print("Le "+((Chat) refuge.getAnimauxR�fugi�s().get(i)).typeAnimal()+" : ");
					System.out.println(((Chat) refuge.getAnimauxR�fugi�s().get(i)).getNom());
				}
				if (refuge.getAnimauxR�fugi�s().get(i) instanceof Chien){
					System.out.print("Le "+((Chien) refuge.getAnimauxR�fugi�s().get(i)).typeAnimal()+" : ");
					System.out.println(((Chien) refuge.getAnimauxR�fugi�s().get(i)).getNom());
				}
				if (refuge.getAnimauxR�fugi�s().get(i) instanceof Perroquet){
					System.out.print("Le "+((Perroquet) refuge.getAnimauxR�fugi�s().get(i)).typeAnimal()+" : ");
					System.out.println(((Perroquet) refuge.getAnimauxR�fugi�s().get(i)).getNom());
				}
				if (refuge.getAnimauxR�fugi�s().get(i) instanceof Perruche){
					System.out.print("Le "+((Perruche) refuge.getAnimauxR�fugi�s().get(i)).typeAnimal()+" : ");
					System.out.println(((Perruche) refuge.getAnimauxR�fugi�s().get(i)).getNom());
				}
			}
			System.out.println("Voulez vous interragir avec un autre "+reponse2+"?");
			reponse = sc.nextLine().toLowerCase();
		}
		System.out.println("Passez une bonne journ�e.");
		sc.close();
		
	}

}