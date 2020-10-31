import javax.swing.*;
import java.awt.GridLayout;

public class GrilleCalculatriceSimple {
  public static void main(String[] args) {
    // Cr�e un panneau
    JPanel contenuFen�tre = new JPanel();
		
    // Affecte un gestionnaire de pr�sentation � ce panneau
    GridLayout disposition = new GridLayout(4,2); 
    contenuFen�tre.setLayout(disposition);
		
    // Cr�e les contr�les en m�moire 
    JLabel label1 = new JLabel("Nombre 1 :");
    JTextField entr�e1 = new JTextField(10);
    JLabel label2 = new JLabel("Nombre 2 :");
    JTextField entr�e2 = new JTextField(10);
    JLabel label3 = new JLabel("Somme :");
    JTextField r�sultat = new JTextField(10);
    JButton lancer = new JButton("Ajouter");
		
    // Ajoute les contr�les au panneau
    contenuFen�tre.add(label1); 
    contenuFen�tre.add(entr�e1);
    contenuFen�tre.add(label2);
    contenuFen�tre.add(entr�e2);
    contenuFen�tre.add(label3);
    contenuFen�tre.add(r�sultat);
    contenuFen�tre.add(lancer);

    // Cr�e le cadre et y ajoute le panneau 
    JFrame cadre = new JFrame("Ma premi�re calculatrice");

    cadre.setContentPane(contenuFen�tre);
		
    // Affecte ses dimensions � la fen�tre et la rend visible
    cadre.setSize(400,100);
    cadre.setVisible(true);
  }
}