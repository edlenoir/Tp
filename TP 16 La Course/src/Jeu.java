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
            int valeurD� = lancerD�();
            System.out.println("lancer du d� : " + valeurD�);
            this.plateau.afficherCase(this.positionPions[i]);
            int d�placement = this.plateau.calculDeplacement(this.positionPions[i], valeurD�);
            this.positionPions[i] += d�placement;
            System.out.println("position du pion " + i + " apr�s avoir jou� : " + this.positionPions[i]);
            sauve = i;
            i = (i+1) % 3;
        }
        System.out.println("Le pion num�ro " + sauve + " a gagn� la partie");
    }

    private boolean estPartieFinie() {
        for (int i = 0; i < this.positionPions.length; i++) {
            if (this.positionPions[i] == Plateau.NB_CASES -1)
                return true;
        }
        return false;
    }
    
    private static int lancerD�() {
        return ((int) (6.0 * Math.random() + 1.0));
    }
}