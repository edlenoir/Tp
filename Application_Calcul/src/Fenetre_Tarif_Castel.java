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

public class Fenetre_Tarif_Castel {
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


	Fenetre_Tarif_Castel() {
		contenuFenêtre = new JPanel();
				
		BorderLayout dispositionl = new BorderLayout(); 
		contenuFenêtre.setLayout(dispositionl);

		String imgUrl="Stonks.jpg";
		ImageIcon icone = new ImageIcon(imgUrl);
		  

		JLabel jlabel = new JLabel(icone, JLabel.CENTER);
		  

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
		 	    HT.setText("14.00");
		 	    TTC.setText("15.40");
		 	    HT.requestFocus();
		 	    TTC.requestFocus();
		 	}
		 	 if(nb_km> 5 && nb_km <= 20) {
		 	    res_ht = nb_km * 1.77;
		 	    res_ttc = nb_km * 1.95;
		 	    HT.setText("" + res_ht);
		 	    TTC.setText("" + res_ttc);
		 	    HT.requestFocus();
		 	    TTC.requestFocus();
		 	 }
		 	 if(nb_km> 20 && nb_km <= 60) {
		 	    res_ht = nb_km * 1.70;
		 	    res_ttc = nb_km * 1.87;
		 	    HT.setText("" + res_ht);
		 	    TTC.setText("" + res_ttc);
		 	    HT.requestFocus();
		 	    TTC.requestFocus();
		 	  }
		 	  if(nb_km>60) {
		 	    res_ht = nb_km * 1.66;
		 	    res_ttc = nb_km * 1.83;
		 	    HT.setText("" + res_ht);
		 	    TTC.setText("" + res_ttc);
		 	    HT.requestFocus();
		 	    TTC.requestFocus();
		 	 }
		 	    		
		     }
		    });
		  
		    bouton1 = new JButton("Aller-Retour");
		    bouton1.addActionListener( new ActionListener()
		    {
		    	 public void actionPerformed(ActionEvent ae)
		     	{
		 	    	double res_ht=0;
		 	    	double res_ttc=0;
		 	    	nb_km = Float.parseFloat(Km.getText());
		 	    	Km.requestFocus();
		 	    	if(nb_km <= 5) {
		 	    		HT.setText("28.00");
		 	    		TTC.setText("30.80");
		 	    		HT.requestFocus();
		 	    		TTC.requestFocus();
		 	    	}
		 	    	if(nb_km> 5 && nb_km <= 20) {
		 	    		res_ht = (nb_km * 1.77)*2;
		 	    		res_ttc = (nb_km * 1.95)*2;
		 	    		HT.setText("" + res_ht);
		 	    		TTC.setText("" + res_ttc);
		 	    	    HT.requestFocus();
		 	    	    TTC.requestFocus();
		 	    	}
		 	     	if(nb_km> 20 && nb_km <= 60) {
		 	    		res_ht = nb_km * 1.7;
		 	    		res_ttc = nb_km * 1.87;
		 	    		HT.setText("" + res_ht);
		 	    		TTC.setText("" + res_ttc);
		 	    	    HT.requestFocus();
		 	    	    TTC.requestFocus();
		 	    	}
		 	    	if(nb_km>60) {
		 	    		res_ht = (nb_km * 1.66)*2;
		 	    		res_ttc = (nb_km * 1.83)*2;
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
		    Titrepage = new JLabel("TARIF CASTEL");
		    Titrepage.setFont(new Font("Serif", Font.PLAIN, 30));
		    espace = new JLabel("    ");
		    

		    panneau = new JPanel();
		    GridLayout disposition2 = new GridLayout(5, 1); 
		    panneau.setLayout(disposition2);

		    
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


		    contenuFenêtre.add("Center", panneau);

               
		    JFrame frame = new JFrame("TARIF CASTEL");
		    frame.setContentPane(contenuFenêtre);
		    frame.setLocation(800,600);
		    
		    frame.pack(); 

		    frame.setVisible(true);
		    frame.getContentPane().add(jlabel);
		    frame.validate();
		  }
		    
		    
	}




