import java.util.Scanner;

public class Main {
	//Fr Bon

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String nomEquipe = null;
		Classe classePerso1 = null;
		Mage mage = null;
		Guerrier guerrier = null;
		Voleur voleur = null;
		String classe = null;
		Perso personnage1 = null;
		
		//Choix de cr�e une equipe 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bonjour et bienvenue dans le systeme de cr�ation de personnage");
		System.out.println("Voulez vous cr�er une �quipe");
		System.out.println("Veuillez �crire true pour Oui ou false pour Non");
		boolean cEquipe = sc.nextBoolean();
		int nbEquipe;
				
		if( cEquipe ) {
			System.out.println("Veuillez saisir le nom de votre �quipe");
			Scanner sc3 = new Scanner(System.in);
			nomEquipe = sc3.nextLine();
			System.out.println("Veuillez saisir le nombre de co�quipiers");
			System.out.println("Les �quipes peuvent �tre compos�es de 4 personnes maximum (vous comptez pour une personne)");
			nbEquipe = sc.nextInt();
			while (nbEquipe > 5) {
				System.out.println("Veuillez saisir le nombre de co�quipiers");
				System.out.println("Les �quipes peuvent �tre compos�es de 4 personnes maximum (vous comptez pour une personne)");
				nbEquipe = sc.nextInt();
			}
		} else {
			nbEquipe =1;
		}	
		Equipe e1 = new Equipe(nomEquipe);
		
		//Cr�eation de un ou plusieur perso
		
		for(int i =1 ; i <= nbEquipe; i++) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Donnez un nom � votre Personnage");
			String nomPerso = sc1.nextLine();
			System.out.println("Votre Personnage se nomme : " + nomPerso);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Donner une des races suivante a votre Personnage");
			System.out.println("Orc  - Humain  - Nain  - Elfe ");
			String race = sc2.nextLine().toLowerCase(); 
		
			while (!race.equals("orc") && !race.equals("humain") && !race.equals("nain") && !race.equals("elfe") ) {
				System.out.println("La race saisi doit etre une des quatre Orc - Humain - Nain - Elfe");
				race = sc2.nextLine().toLowerCase();
				
			}
			System.out.println("Votre Personnage se nomme : " + nomPerso +" et c'est un "+ race );
			//Cr�eation de Perso
			personnage1 = new Perso(nomPerso , race);
			//Choix de sa classe
			System.out.println("Veuillez choisir une classe pour votre Personnage ou cr�er ta classe");
			System.out.println("Mage - Voleur - Guerrier");
			System.out.println("Veuillez saisir 'cr�er' pour cr�er votre classe");
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
			case "cr�er":
				//Cr�eation d'une classePerso
				System.out.println("Pour cr�er une classe il faut la nommer");
				String Nomclasse = sc2.nextLine();
				System.out.println("Ensuite il faut r�partir 10 points de Caracteristiques dans trois Caracteristiques qui sont la Force, l'Intelligence et la Discretion");
				System.out.println("Veuillez saisir le nombre de points de Force");
				//Attribution des point pour la classe
				int Force = sc2.nextInt();
				System.out.println("Veuillez saisir le nombre de points d'intelligence");
				int Intelligence = sc2.nextInt();
				System.out.println("Veuillez saisir le nombre de points de discretion");
				int discretion = sc2.nextInt();
				//Verification des point pour la classe
				while (Force+Intelligence+discretion != 10 || Force<=0 || Intelligence<=0  || discretion<=0) {
					System.out.println("Vous devez recommencer car vous avez mis plus ou moins de 10 points au total");
					System.out.println("Ensuite il faut r�partir 10 points de Caracteristiques dans trois Caracteristiques qui sont la Force, l'Intelligence et la Discretion");
					System.out.println("Veuillez saisir le nombre de points de Force");
					Force = sc2.nextInt();
					System.out.println("Veuillez saisir le nombre de points d'intelligence");
					Intelligence = sc2.nextInt();
					System.out.println("Veuillez saisir le nombre de points de discretion");
					discretion = sc2.nextInt();
				}
				//Confirmation de la creation de la classePerso
				System.out.println("Voil� votre classe " + Nomclasse + " est cr��e ");
				classePerso1 = new ClassePerso(Force,Intelligence,discretion,Nomclasse);
				classePerso1.Equipement();
				break;
			}
				//Ajout dans la liste de perso
				if (nbEquipe != 1 && classe.equals("cr�er")) {
					e1.AjouterUnMenbre(personnage1,classePerso1);
				}
				if (nbEquipe != 1 && classe.equals("mage")) {
					e1.AjouterUnMenbre(personnage1,mage);
				}
				if (nbEquipe != 1 && classe.equals("guerrier")) {
					e1.AjouterUnMenbre(personnage1,guerrier);
				}
				if (nbEquipe != 1 && classe.equals("voleur")) {
					e1.AjouterUnMenbre(personnage1,voleur);
				}
			}
			System.out.println("\nBonne Aventure !\n");
			if(!cEquipe && classe.equals("mage")) {
				System.out.println(personnage1);
				System.out.println(mage);
			}
			if(!cEquipe && classe.equals("voleur")){
				System.out.println(personnage1);
				System.out.println(voleur);
			}
			if(!cEquipe && classe.equals("guerrier")) {
				System.out.println(personnage1);
				System.out.println(guerrier);
			}
			if(!cEquipe && classe.equals("cr�er")) {
				System.out.println(personnage1);
				System.out.println(classePerso1);
			}
			if(nbEquipe>1) {
			System.out.println(e1.toString());
				for(int j = 0 ; j < nbEquipe; j++) {
					System.out.print("Votre Personnage numero " + (j+1) + " est un " + e1.lPerso.get(j).toString());
					System.out.print(e1.lClasse.get(j).toString());
				}
			}
		
	}
}		
			
		
		

	


