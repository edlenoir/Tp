import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
public class Calculatrice {
  // Déclaration de tous les composants de la calculatrice.
  JPanel contenuFenêtre;
  JTextField champAffichage;
  JButton bouton0;
  JButton bouton1;
  JButton bouton2;
  JButton bouton3;
  JButton bouton4;
  JButton bouton5;
  JButton bouton6;
  JButton bouton7;
  JButton bouton8;
  JButton bouton9;
  JButton boutonVirgule;
  JButton boutonEgale;
  JPanel panneauChiffres;

  // Le constructeur crée les composants en mémoire
  // et les ajoute au cadre en utilisant une combinaison 
  // de Borderlayout et Gridlayout
  Calculatrice() {
    contenuFenêtre = new JPanel();
		
    // Affecte un gestionnaire de présentation à ce panneau
    BorderLayout dispositionl = new BorderLayout(); 
    contenuFenêtre.setLayout(dispositionl);

    // Crée le champ d'affichage et le positionne dans   
    // la zone nord de la fenêtre
    champAffichage = new JTextField(30);
    contenuFenêtre.add("North", champAffichage);
     
    // Crée les boutons en utilisant le constructeur de
    // la classe JButton qui prend en paramètre le libellé 
    // du bouton 
    bouton0 = new JButton("0");
    bouton1 = new JButton("1");
    bouton2 = new JButton("2");
    bouton3 = new JButton("3");
    bouton4 = new JButton("4");
    bouton5 = new JButton("5");
    bouton6 = new JButton("6");
    bouton7 = new JButton("7");
    bouton8 = new JButton("8");
    bouton9 = new JButton("9");
    boutonVirgule = new JButton(",");
    boutonEgale = new JButton("=");
 // Crée le panneau avec le quadrillage qui contient
    // les 12 boutons - les 10 boutons numériques et ceux
    // représentant la virgule et le signe égale
    panneauChiffres = new JPanel();
    GridLayout disposition2 = new GridLayout(4, 3); 
    panneauChiffres.setLayout(disposition2);

    // Ajoute les contrôles au panneau panneauChiffres
    panneauChiffres.add(bouton1);
    panneauChiffres.add(bouton2);
    panneauChiffres.add(bouton3);
    panneauChiffres.add(bouton4);
    panneauChiffres.add(bouton5);
    panneauChiffres.add(bouton6);
    panneauChiffres.add(bouton7);
    panneauChiffres.add(bouton8);
    panneauChiffres.add(bouton9);
    panneauChiffres.add(bouton0);
    panneauChiffres.add(boutonVirgule);
    panneauChiffres.add(boutonEgale);

    // Ajoute panneauChiffres à la zone centrale de la 
    // fenêtre
    contenuFenêtre.add("Center", panneauChiffres);

    // Crée le cadre et lui affecte son contenu	               
    JFrame frame = new JFrame("Calculatrice");
    frame.setContentPane(contenuFenêtre);

    // Affecte à la fenêtre des dimensions suffisantes pour	  
    // prendre en compte tous les contrôles
    frame.pack(); 

    // Enfin, affiche la fenêtre
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    Calculatrice calc = new Calculatrice();
  }
}