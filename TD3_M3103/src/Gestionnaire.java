import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Gestionnaire {

    private Map<String, Contact> dico;
    
    
    public Gestionnaire() {
        this.dico = new HashMap<>();
    }
    
    public void ajouterContact (Gestionnaire gestionnaire, Contact contactAdd)throws ContactVide {
    	String cle = contactAdd.toString();
    	System.out.println(cle);
    	if (contactAdd == null) 
    		throw new ContactVide("Le contact est vide");
    	if(gestionnaire.dico.containsKey(cle))
    	{
    		System.out.println("Deja ajouter");
    	}
        gestionnaire.dico.put(cle, contactAdd);
  }
    
    public Object rechercherContact(String nom, String prenom) {
    	String cle = nom + " " + prenom;
    	if (dico.containsKey(cle)){
    		 return dico.get(cle);
    	}
        return null;
        }
    }
    
    
    
