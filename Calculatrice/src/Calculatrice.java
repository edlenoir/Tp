import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
public class Calculatrice {
  // D�claration de tous les composants de la calculatrice.
  JPanel contenuFen�tre;
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

  // Le constructeur cr�e les composants en m�moire
  // et les ajoute au cadre en utilisant une combinaison 
  // de Borderlayout et Gridlayout
  Calculatrice() {
    contenuFen�tre = new JPanel();
		
    // Affecte un gestionnaire de pr�sentation � ce panneau
    BorderLayout dispositionl = new BorderLayout(); 
    contenuFen�tre.setLayout(dispositionl);

    // Cr�e le champ d'affichage et le positionne dans   
    // la zone nord de la fen�tre
    champAffichage = new JTextField(30);
    contenuFen�tre.add("North", champAffichage);
     
    // Cr�e les boutons en utilisant le constructeur de
    // la classe JButton qui prend en param�tre le libell� 
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
 // Cr�e le panneau avec le quadrillage qui contient
    // les 12 boutons - les 10 boutons num�riques et ceux
    // repr�sentant la virgule et le signe �gale
    panneauChiffres = new JPanel();
    GridLayout disposition2 = new GridLayout(4, 3); 
    panneauChiffres.setLayout(disposition2);

    // Ajoute les contr�les au panneau panneauChiffres
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

    // Ajoute panneauChiffres � la zone centrale de la 
    // fen�tre
    contenuFen�tre.add("Center", panneauChiffres);

    // Cr�e le cadre et lui affecte son contenu	               
    JFrame frame = new JFrame("Calculatrice");
    frame.setContentPane(contenuFen�tre);

    // Affecte � la fen�tre des dimensions suffisantes pour	  
    // prendre en compte tous les contr�les
    frame.pack(); 

    // Enfin, affiche la fen�tre
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    Calculatrice calc = new Calculatrice();
  }
}