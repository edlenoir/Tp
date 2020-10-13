import java.util.Scanner;

public class Main {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//LinkedList<Perso> LPerso = new LinkedList<Perso>();
		//LinkedList<Classe> LClasse = new LinkedList<Classe>();
		String nomEquipe = null;
		
		Classe ClassePerso1 = null;
		Mage mage = null;
		Guerrier guerrier = null;
		Voleur voleur = null;
		String Classe = null;
		Perso Personnage1 = null;
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
			String NomPerso = sc1.nextLine();
			System.out.println("Votre Personnage se nomme : " + NomPerso);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Donner une des Race suivante a votre Personnage");
			System.out.println("Orc  - Humain  - Nain  - Elf ");
			String Race = sc2.nextLine().toLowerCase(); 
		
			while (!Race.equals("orc") && !Race.equals("humain") && !Race.equals("nain") && !Race.equals("elf") ) {
				System.out.println("La Race saisi doit etre une des quatre Orc - Humain - Nain - Elf");
				Race = sc2.nextLine();
				
			}
			System.out.println("Votre Personnage se nomme : " + NomPerso +" Et il est un "+ Race );
			//Créeation de Perso
			Personnage1 = new Perso(NomPerso , Race);
			//Choix de sa classe
			System.out.println("Veuillez choisir un Classe pour votre Personnage ou crée ta Classe");
			System.out.println("Mage - Voleur - Guerrier");
			System.out.println("Veuillez saisir Crée pour crée votre classe");
			Classe = sc2.nextLine().toLowerCase();

			switch (Classe) {
			case "mage":
				mage = new Mage(0,0,0,"Mage");
				break;
			case "voleur":
				voleur = new Voleur(0,0,0,"Voleur");
				break;
			case "guerrier":
				guerrier = new Guerrier(0,0,0,"Guerrier");
				break;
			case "crée":
				//Créeation d'une ClassePerso
				System.out.println("Pour crée un classe il faut la nommée");
				String NomClasse = sc2.nextLine();
				System.out.println("Ensuite il faut repartir 10 point de Caracteristique dans trois Caracteristique qui sont la Force,L'intelligence,La Discretion");
				System.out.println("Veuillez saisir le nombre de point de Force");
				//Attribution des point pour la classe
				int Force = sc2.nextInt();
				System.out.println("Veuillez saisir le nombre de point d'intelligence");
				int Intelligence = sc2.nextInt();
				System.out.println("Veuillez saisir le nombre de point de discretion");
				int discretion = sc2.nextInt();
				//Verification des point pour la classe
				while (Force+Intelligence+discretion != 10) {
					System.out.println("Vous devez recommencer car vous avait mis plus ou moin de 10 point au total");
					System.out.println("Ensuite il faut repartir 10 point de Caracteristique dans trois Caracteristique qui sont la Force,L'intelligence,La Discretion");
					System.out.println("Veuillez saisir le nombre de point de Force");
					Force = sc2.nextInt();
					System.out.println("Veuillez saisir le nombre de point d'intelligence");
					Intelligence = sc2.nextInt();
					System.out.println("Veuillez saisir le nombre de point de discretion");
					discretion = sc2.nextInt();
				}
				//Confirmation de la creation de la ClassePerso
				System.out.println("Voila votre Classe " + NomClasse + " est créée ");
				ClassePerso1 = new ClassePerso(Force,Intelligence,discretion,NomClasse);
				break;
			}
				//Ajout dans la liste de perso
				//e1 = new Equipe(nomEquipe);
				if (nbEquipe != 1 && Classe.equals("crée")) {
					e1.AjouterUnMenbre(Personnage1,ClassePerso1);
				}
				if (nbEquipe != 1 && Classe.equals("mage")) {
					e1.AjouterUnMenbre(Personnage1,mage);
				}
				if (nbEquipe != 1 && Classe.equals("guerrier")) {
					e1.AjouterUnMenbre(Personnage1,guerrier);
				}
				if (nbEquipe != 1 && Classe.equals("voleur")) {
					e1.AjouterUnMenbre(Personnage1,voleur);
				}
			}
			System.out.println("\nBonne Aventure !\n");
			if(!cEquipe && Classe.equals("mage")) {
				System.out.println("wa"+Personnage1);
				System.out.println(mage);
			}
			if(!cEquipe && Classe.equals("voleur")){
				System.out.println("wa"+Personnage1);
				System.out.println(voleur);
			}
			if(!cEquipe && Classe.equals("guerrier")) {
				System.out.println("wa"+Personnage1);
				System.out.println(guerrier);
			}
			if(!cEquipe && Classe.equals("crée")) {
				System.out.println("wa"+Personnage1);
				System.out.println(ClassePerso1);
			}
			
			System.out.println(e1.toString());
			
			for(int j = 0 ; j < nbEquipe; j++) {
				System.out.print("Votre Personnage numero " + (j+1) + " est un " + e1.LPerso.get(j).toString());
				System.out.print(e1.LClasse.get(j).toString());
			}
		
	}
}		
			
		
		

	


