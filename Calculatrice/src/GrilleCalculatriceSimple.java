import javax.swing.*;
import java.awt.GridLayout;

public class GrilleCalculatriceSimple {
  public static void main(String[] args) {
    // Crée un panneau
    JPanel contenuFenêtre = new JPanel();
		
    // Affecte un gestionnaire de présentation à ce panneau
    GridLayout disposition = new GridLayout(4,2); 
    contenuFenêtre.setLayout(disposition);
		
    // Crée les contrôles en mémoire 
    JLabel label1 = new JLabel("Nombre 1 :");
    JTextField entrée1 = new JTextField(10);
    JLabel label2 = new JLabel("Nombre 2 :");
    JTextField entrée2 = new JTextField(10);
    JLabel label3 = new JLabel("Somme :");
    JTextField résultat = new JTextField(10);
    JButton lancer = new JButton("Ajouter");
		
    // Ajoute les contrôles au panneau
    contenuFenêtre.add(label1); 
    contenuFenêtre.add(entrée1);
    contenuFenêtre.add(label2);
    contenuFenêtre.add(entrée2);
    contenuFenêtre.add(label3);
    contenuFenêtre.add(résultat);
    contenuFenêtre.add(lancer);

    // Crée le cadre et y ajoute le panneau 
    JFrame cadre = new JFrame("Ma première calculatrice");

    cadre.setContentPane(contenuFenêtre);
		
    // Affecte ses dimensions à la fenêtre et la rend visible
    cadre.setSize(400,100);
    cadre.setVisible(true);
  }
}