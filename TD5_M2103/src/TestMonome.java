
import java.util.Scanner; 

import java.util.*;

public class TestMonome {

	public static void main(String[] args) {
		Monome m1;
		Monome m2;
		int choix =0;
		do {
		
		System.out.println("Quel est votre choix:");
		System.out.println("	1- modifier le premier monome");
		System.out.println("	2- modifier le deuxieme monome");
		System.out.println("	3- afficher le premier monome");
		System.out.println("	4- afficher le deuxieme monome");
		System.out.println("	5- calculer la somme des 2 monomes");
		System.out.println("	6- afficher le produit 2 monomes");
		System.out.println("	7- modifier la derivee du premier monome");
		System.out.println("	8- calculer la derivee du deuxieme monome");
		System.out.println("	9- quitter l'application");
		Scanner c =new Scanner(System.in);
		choix = c.nextInt();
		}while(choix<=9);

	}



}
