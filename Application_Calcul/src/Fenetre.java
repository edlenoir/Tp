import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre {
  // Déclaration de tous les composants de la calculatrice.
  JPanel contenuFenêtre;
  JTextField champAffichage;
  JButton bouton0;
  JButton bouton1;
  JPanel panneauChiffres;

  // Le constructeur crée les composants en mémoire
  // et les ajoute au cadre en utilisant une combinaison 
  // de Borderlayout et Gridlayout
  Fenetre() {
    contenuFenêtre = new JPanel();
		
    // Affecte un gestionnaire de présentation à ce panneau
    BorderLayout dispositionl = new BorderLayout(); 
    contenuFenêtre.setLayout(dispositionl);


     
    // Crée les boutons en utilisant le constructeur de
    // la classe JButton qui prend en paramètre le libellé 
    // du bouton 
    bouton0 = new JButton("Tarif Carcassonne");
    bouton0.addActionListener( new ActionListener()
    {
    public void actionPerformed(ActionEvent ae)
    	{
    		Fenetre_Tarif_Carca f_tarif1 = new Fenetre_Tarif_Carca();
    	}
    }
    	);
    bouton1 = new JButton("Tarif Castel");
    bouton1.addActionListener( new ActionListener()
    {
    public void actionPerformed(ActionEvent ae)
    	{
    		Fenetre_Tarif_Castel f_tarif2 = new Fenetre_Tarif_Castel();
    	}
    }
    	);
   
 // Crée le panneau avec le quadrillage qui contient
    // les 12 boutons - les 10 boutons numériques et ceux
    // représentant la virgule et le signe égale
    panneauChiffres = new JPanel();
    GridLayout disposition2 = new GridLayout(2,2); 
    panneauChiffres.setLayout(disposition2);

    // Ajoute les contrôles au panneau panneauChiffres
    panneauChiffres.add(bouton0);
    panneauChiffres.add(bouton1);

    // Ajoute panneauChiffres à la zone centrale de la 
    // fenêtre
    contenuFenêtre.add("Center", panneauChiffres);

    // Crée le cadre et lui affecte son contenu	               
    JFrame frame = new JFrame("Application Calcultarif");
    frame.setContentPane(contenuFenêtre);
    frame.setPreferredSize(new Dimension(400,300));
    frame.setLocation(400,400);

    // Affecte à la fenêtre des dimensions suffisantes pour	  
    // prendre en compte tous les contrôles
    frame.pack(); 

    // Enfin, affiche la fenêtre
    frame.setVisible(true);
  }
}
