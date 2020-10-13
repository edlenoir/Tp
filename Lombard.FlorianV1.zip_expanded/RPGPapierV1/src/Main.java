import java.util.Scanner;

public class Main {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String nomEquipe = null;
		Classe classePerso1 = null;
		Mage mage = null;
		Guerrier guerrier = null;
		Voleur voleur = null;
		String classe = null;
		Perso personnage1 = null;
		
		//Choix de crée une equipe 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bonjour et Bienvenue dans le systeme de creation de Personnage");
		System.out.println("Voulez vous créer une equipe");
		System.out.println("Veuillez ecrire true pour Oui ou false pour Non");
		boolean cEquipe = sc.nextBoolean();
		int nbEquipe;
				
		if( cEquipe ) {
			System.out.println("Veuillez saisir le nom de votre equipe");
			Scanner sc3 = new Scanner(System.in);
			nomEquipe = sc3.nextLine();
			System.out.println("Veuillez saisir le nombre de coéquipier");
			System.out.println("Les equipe peuve etre composer de 4 personne maximum (vous compter pour une personne)");
			nbEquipe = sc.nextInt();
			while (nbEquipe > 5) {
				System.out.println("Veuillez saisir le nombre de coéquipier");
				System.out.println("Les equipe peuve etre composer de 4 personne maximum (vous competer pour une personne)");
				nbEquipe = sc.nextInt();
			}
		} else {
			nbEquipe =1;
		}	
		Equipe e1 = new Equipe(nomEquipe);
		
		//Créeation de un ou plusieur perso
		
		for(int i =1 ; i <= nbEquipe; i++) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Donner un nom a votre Personnage");
			String nomPerso = sc1.nextLine();
			System.out.println("Votre Personnage se nomme : " + nomPerso);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Donner une des Race suivante a votre Personnage");
			System.out.println("Orc  - Humain  - Nain  - Elf ");
			String race = sc2.nextLine().toLowerCase(); 
		
			while (!race.equals("orc") && !race.equals("humain") && !race.equals("nain") && !race.equals("elf") ) {
				System.out.println("La Race saisi doit etre une des quatre Orc - Humain - Nain - Elf");
				race = sc2.nextLine();
				
			}
			System.out.println("Votre Personnage se nomme : " + nomPerso +" Et il est un "+ race );
			//Créeation de Perso
			personnage1 = new Perso(nomPerso , race);
			//Choix de sa classe
			System.out.println("Veuillez choisir un Classe pour votre Personnage ou crée ta Classe");
			System.out.println("Mage - Voleur - Guerrier");
			System.out.println("Veuillez saisir Crée pour crée votre classe");
			classe = sc2.nextLine().toLowerCase();

			switch (classe) {
			case "mage":
				mage = new Mage(0,0,0,"Mage");
				mage.Equipement();
				break;
			case "voleur":
				voleur = new Voleur(0,0,0,"Voleur");
				voleur.Equipement();
				break;
			case "guerrier":
				guerrier = new Guerrier(0,0,0,"Guerrier");
				guerrier.Equipement();
				break;
			case "crée":
				//Créeation d'une ClassePerso
				System.out.println("Pour crée un classe il faut la nommée");
				String nomClasse = sc2.nextLine();
				System.out.println("Ensuite il faut repartir 10 point de Caracteristique dans trois Caracteristique qui sont la Force,L'intelligence,La Discretion");
				System.out.println("Veuillez saisir le nombre de point de Force");
				//Attribution des point pour la classe
				int force = sc2.nextInt();
				System.out.println("Veuillez saisir le nombre de point d'intelligence");
				int intelligence = sc2.nextInt();
				System.out.println("Veuillez saisir le nombre de point de discretion");
				int discretion = sc2.nextInt();
				//Verification des point pour la classe
				while (force+intelligence+discretion != 10) {
					System.out.println("Vous devez recommencer car vous avait mis plus ou moin de 10 point au total");
					System.out.println("Ensuite il faut repartir 10 point de Caracteristique dans trois Caracteristique qui sont la Force,L'intelligence,La Discretion");
					System.out.println("Veuillez saisir le nombre de point de Force");
					force = sc2.nextInt();
					System.out.println("Veuillez saisir le nombre de point d'intelligence");
					intelligence = sc2.nextInt();
					System.out.println("Veuillez saisir le nombre de point de discretion");
					discretion = sc2.nextInt();
				}
				//Confirmation de la creation de la ClassePerso
				System.out.println("Voila votre classe " + nomClasse + " est créée ");
				classePerso1 = new ClassePerso(Force,Intelligence,discretion,nomClasse);
				classePerso1.Equipement();
				break;
			}
				//Ajout dans la liste de perso
				if (nbEquipe != 1 && Classe.equals("crée")) {
					e1.AjouterUnMenbre(personnage1,classePerso1);
				}
				if (nbEquipe != 1 && Classe.equals("mage")) {
					e1.AjouterUnMenbre(personnage1,mage);
				}
				if (nbEquipe != 1 && Classe.equals("guerrier")) {
					e1.AjouterUnMenbre(personnage1,guerrier);
				}
				if (nbEquipe != 1 && Classe.equals("voleur")) {
					e1.AjouterUnMenbre(personnage1,voleur);
				}
			}
			System.out.println("\nBonne Aventure !\n");
			if(!cEquipe && Classe.equals("mage")) {
				System.out.println(personnage1);
				System.out.println(mage);
			}
			if(!cEquipe && Classe.equals("voleur")){
				System.out.println(personnage1);
				System.out.println(voleur);
			}
			if(!cEquipe && Classe.equals("guerrier")) {
				System.out.println(personnage1);
				System.out.println(guerrier);
			}
			if(!cEquipe && Classe.equals("crée")) {
				System.out.println(personnage1);
				System.out.println(classePerso1);
			}
			if (nbEquipe>1) {
				System.out.println(e1.toString());
				for(int j = 0 ; j < nbEquipe; j++) {
					System.out.print("Votre Personnage numero " + (j+1) + " est un " + e1.lPerso.get(j).toString());
					System.out.print(e1.lClasse.get(j).toString());
				}
			}
		
	}
}		
			
		
		

	


