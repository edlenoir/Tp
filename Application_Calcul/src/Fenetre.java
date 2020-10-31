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
  // D�claration de tous les composants de la calculatrice.
  JPanel contenuFen�tre;
  JTextField champAffichage;
  JButton bouton0;
  JButton bouton1;
  JPanel panneauChiffres;

  // Le constructeur cr�e les composants en m�moire
  // et les ajoute au cadre en utilisant une combinaison 
  // de Borderlayout et Gridlayout
  Fenetre() {
    contenuFen�tre = new JPanel();
		
    // Affecte un gestionnaire de pr�sentation � ce panneau
    BorderLayout dispositionl = new BorderLayout(); 
    contenuFen�tre.setLayout(dispositionl);


     
    // Cr�e les boutons en utilisant le constructeur de
    // la classe JButton qui prend en param�tre le libell� 
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
   
 // Cr�e le panneau avec le quadrillage qui contient
    // les 12 boutons - les 10 boutons num�riques et ceux
    // repr�sentant la virgule et le signe �gale
    panneauChiffres = new JPanel();
    GridLayout disposition2 = new GridLayout(2,2); 
    panneauChiffres.setLayout(disposition2);

    // Ajoute les contr�les au panneau panneauChiffres
    panneauChiffres.add(bouton0);
    panneauChiffres.add(bouton1);

    // Ajoute panneauChiffres � la zone centrale de la 
    // fen�tre
    contenuFen�tre.add("Center", panneauChiffres);

    // Cr�e le cadre et lui affecte son contenu	               
    JFrame frame = new JFrame("Application Calcultarif");
    frame.setContentPane(contenuFen�tre);
    frame.setPreferredSize(new Dimension(400,300));
    frame.setLocation(400,400);

    // Affecte � la fen�tre des dimensions suffisantes pour	  
    // prendre en compte tous les contr�les
    frame.pack(); 

    // Enfin, affiche la fen�tre
    frame.setVisible(true);
  }
}
