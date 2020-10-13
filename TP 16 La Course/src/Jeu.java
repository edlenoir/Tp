import java.util.LinkedList;

public class Jeu {
    
    public static final int NOMBRE_JOUEURS = 3;
    private int[] positionPions;
    private Plateau plateau;
    
    public Jeu() {
        this.positionPions = new int[NOMBRE_JOUEURS];
        this.plateau = new Plateau();
    }
    
    public void jouerPartie() {
        int i = 0;
        int sauve = 0;
        while (!this.estPartieFinie()) {
            System.out.println("position du pion " + i + " avant de jouer : " + this.positionPions[i]);
            int valeurDé = lancerDé();
            System.out.println("lancer du dé : " + valeurDé);
            this.plateau.afficherCase(this.positionPions[i]);
            int déplacement = this.plateau.calculDeplacement(this.positionPions[i], valeurDé);
            this.positionPions[i] += déplacement;
            System.out.println("position du pion " + i + " après avoir joué : " + this.positionPions[i]);
            sauve = i;
            i = (i+1) % 3;
        }
        System.out.println("Le pion numéro " + sauve + " a gagné la partie");
    }

    private boolean estPartieFinie() {
        for (int i = 0; i < this.positionPions.length; i++) {
            if (this.positionPions[i] == Plateau.NB_CASES -1)
                return true;
        }
        return false;
    }
    
    private static int lancerDé() {
        return ((int) (6.0 * Math.random() + 1.0));
    }
}