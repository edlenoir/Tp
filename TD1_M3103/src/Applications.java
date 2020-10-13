
public class Applications {

	public static void main(String[] args) throws NotFound {
		GestionnaireApp g1 = new GestionnaireApp();
		App_Systeme a1 = new App_Systeme();
		App_Utilisateur a2 =new App_Utilisateur();
		App_Graphique a3 = new App_Graphique() ;
		App_Noyau a4 = new App_Noyau();
		g1.ajouterApplication(a1);
		g1.ajouterApplication(a2);
		g1.ajouterApplication(a3);
		g1.ajouterApplication(a4);
		g1.desinstallation(a1);
		g1.desinstallation(a2);
		g1.desinstallation(a3);
		g1.desinstallation(a4);
		g1.desinstallation(a1);
		

		

	}

}
