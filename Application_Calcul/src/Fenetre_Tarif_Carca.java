import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre_Tarif_Carca {
	 // Déclaration de tous les composants de la calculatrice.
	  JPanel contenuFenêtre;
	  JTextField champAffichage;
	  JButton bouton0;
	  JButton bouton1;
	  JPanel panneau;
	  TextField Km;
	  JLabel libelle_km;
	  TextField HT;
	  JLabel libelle_HT;
	  TextField TTC;
	  JLabel libelle_TTC;
	  JLabel Titrepage;
	  JLabel espace;
	  double nb_km;
	  

	  // Le constructeur crée les composants en mémoire
	  // et les ajoute au cadre en utilisant une combinaison 
	  // de Borderlayout et Gridlayout
	  Fenetre_Tarif_Carca() {
	    contenuFenêtre = new JPanel();
			
	    // Affecte un gestionnaire de présentation à ce panneau
	    BorderLayout dispositionl = new BorderLayout(); 
	    contenuFenêtre.setLayout(dispositionl);


	     
	    // Crée les boutons en utilisant le constructeur de
	    // la classe JButton qui prend en paramètre le libellé 
	    // du bouton 
	    String imgUrl="Stonks.jpg";
	     ImageIcon icone = new ImageIcon(imgUrl);
	  
	     //Création de JLable avec un alignement gauche
	     JLabel jlabel = new JLabel(icone, JLabel.CENTER);
	  
	     //ajouter les deux JLabel a JFrame
	    bouton0 = new JButton("Aller-Simple");
	    bouton0.addActionListener( new ActionListener()
	    {
	    	 public void actionPerformed(ActionEvent ae)
	     	{
	    		double res_ht=0;
		 	    double res_ttc=0;
		 	    nb_km = Float.parseFloat(Km.getText());
		 	    Km.requestFocus();
		 	    if(nb_km <= 5) {
		 	    	HT.setText("9,09");
		 	    	TTC.setText("10,00");
		 	    	HT.requestFocus();
		 	    	TTC.requestFocus();
		 	    }
		 	    if(nb_km> 5 && nb_km <= 20) {
		 	    	res_ht = nb_km * 1.62;
		 	    	res_ttc = nb_km * 1.78;
		 	    	HT.setText("" + res_ht);
		 	    	TTC.setText("" + res_ttc);
		 	    	HT.requestFocus();
		 	    	TTC.requestFocus();
		 	    }
		 	    if(nb_km> 20 && nb_km <= 60) {
		 	    	res_ht = nb_km * 1.53;
		 	    	res_ttc = nb_km * 1.68;
		 	    	HT.setText("" + res_ht);
		 	    	TTC.setText("" + res_ttc);
		 	    	HT.requestFocus();
		 	    	TTC.requestFocus();
		 	    }
		 	    if(nb_km>60) {
		 	    	res_ht = nb_km * 1.51;
		 	    	res_ttc = nb_km * 1.66;
		 	    	HT.setText("" + res_ht);
		 	    	TTC.setText("" + res_ttc);
		 	    	HT.requestFocus();
		 	    	TTC.requestFocus();
		 	    }
	     }
	    });
	  
	    bouton1 = new JButton("Aller-Retour");
	    bouton1.addActionListener(new ActionListener()
	    {
	    	 public void actionPerformed(ActionEvent ae)
	     	{
	    			double res_ht=0;
			 	    double res_ttc=0;
			 	    nb_km = Float.parseFloat(Km.getText());
			 	    Km.requestFocus();
			 	    if(nb_km <= 5) {
			 	    	HT.setText("18.18");
			 	    	TTC.setText("20,00");
			 	    	HT.requestFocus();
			 	    	TTC.requestFocus();
			 	    }
			 	    if(nb_km> 5 && nb_km <= 20) {
			 	    	res_ht = (nb_km * 1.62)*2;
			 	    	res_ttc = (nb_km * 1.78)*2;
			 	    	HT.setText("" + res_ht);
			 	    	TTC.setText("" + res_ttc);
			 	    	HT.requestFocus();
			 	    	TTC.requestFocus();
			 	    }
			 	    if(nb_km> 20 && nb_km <= 60) {
			 	    	res_ht = (nb_km * 1.53)*2;
			 	    	res_ttc = (nb_km * 1.68)*2;
			 	    	HT.setText("" + res_ht);
			 	    	TTC.setText("" + res_ttc);
			 	    	HT.requestFocus();
			 	    	TTC.requestFocus();
			 	    }
			 	    if(nb_km>60) {
			 	    	res_ht = (nb_km * 1.51)*2;
			 	    	res_ttc = (nb_km * 1.66)*2;
			 	    	HT.setText("" + res_ht);
			 	    	TTC.setText("" + res_ttc);
			 	    	HT.requestFocus();
			 	    	TTC.requestFocus();
			 	    }
		     }
	    });
	    Km = new TextField("Ecrire les Km ici", 50);
	    libelle_km = new JLabel("KM  :  ");
	    HT = new TextField("Affiche HT", 50);
	    libelle_HT = new JLabel("HT  :  ");
	    TTC = new TextField("Affiche TTC", 50);
	    libelle_TTC = new JLabel("TTC  :  ");
	    Titrepage = new JLabel("TARIF CARCASSONNE");
	    Titrepage.setFont(new Font("Serif", Font.PLAIN, 30));
	    espace = new JLabel("    ");
	    
	 // Crée le panneau avec le quadrillage qui contient
	    // les 12 boutons - les 10 boutons numériques et ceux
	    // représentant la virgule et le signe égale
	    panneau = new JPanel();
	    GridLayout disposition2 = new GridLayout(5, 5); 
	    panneau.setLayout(disposition2);

	    // Ajoute les contrôles au panneau panneau
	    panneau.add(Titrepage);
	    panneau.add(espace);
	    panneau.add(bouton0);
	    panneau.add(bouton1);
	    panneau.add(libelle_km);
	    panneau.add(Km);
	    panneau.add(libelle_HT);
	    panneau.add(HT);
	    panneau.add(libelle_TTC);
	    panneau.add(TTC);

	    // Ajoute panneau à la zone centrale de la 
	    // fenêtre
	    contenuFenêtre.add("Center", panneau);

	    // Crée le cadre et lui affecte son contenu	               
	    JFrame frame = new JFrame("TARIF CARCASSONNE");
	    frame.setContentPane(contenuFenêtre);
	    frame.setLocation(800,400);
	    

	    // Affecte à la fenêtre des dimensions suffisantes pour	  
	    // prendre en compte tous les contrôles
	    frame.pack(); 

	    // Enfin, affiche la fenêtre
	    frame.setVisible(true);
	    frame.getContentPane().add(jlabel);
	    frame.validate();
	  }
	    
	    
}

