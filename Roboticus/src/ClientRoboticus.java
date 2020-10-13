import java.util.LinkedList;
import java.util.List;

public class ClientRoboticus {
	public static void jouer(List<Roboticus> jeu1, List<Roboticus> jeu2) { 
        int nbPtsJeu1 = 0; 
        for (Roboticus z : jeu1) { 
            nbPtsJeu1 += z.point(); 
        }
        System.out.println("Liste jeu 1" + jeu1);
        System.out.println("nbPoints1 = " + nbPtsJeu1);
        
        int nbPtsJeu2 = 0; 
        for (Roboticus z : jeu2) { 
            nbPtsJeu2 += z.point(); 
        } 
        System.out.println("Liste jeu 2" + jeu2);
        System.out.println("nbPoints2 = " + nbPtsJeu2);
        
        if (nbPtsJeu1 > nbPtsJeu2) { 
            for (Roboticus z : jeu1) { 
                if (z instanceof RoboticusSurdoue) { 
                    ((RoboticusSurdoue) z).ajouterNeurones(2); 
                } 
            } 
        } 
        System.out.println("Liste jeu 1" + jeu1);
        System.out.println("nbPoints1 = " + nbPtsJeu1);
    }
	
	public static String toStringJeu(List<Roboticus> jeu) {
		 
		 }

	
	
	

	public static void main(String[] args) {
		 List<Roboticus> jeu1 = new LinkedList<Roboticus>();
	        jeu1.add(new RoboticusSportif(3,5));
	        jeu1.add(new RoboticusSportif(8,2));
	        jeu1.add(new RoboticusIntell(1,6));
	        jeu1.add(new RoboticusIntell(3,7));
	        jeu1.add(new RoboticusSurdoue(2,4));
	        jeu1.add(new RoboticusSurdoue(2,7));
	        List<Roboticus> jeu2 = new LinkedList<Roboticus>();
	        jeu2.add(new RoboticusSportif(5,2));
	        jeu2.add(new RoboticusSurdoue(4,8));
	        jouer(jeu1,jeu2);
	    }
}