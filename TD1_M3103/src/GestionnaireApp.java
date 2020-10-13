
public class GestionnaireApp {

    private Application[] tableauApp;
    private static final int NB_MAX_APPLICATION = 10000;
    private int nbApplication = 0;

    public GestionnaireApp() {
    	this.nbApplication = 0;
        this.tableauApp = new Application [NB_MAX_APPLICATION];
    }

    public void ajouterApplication(Application app)  {
        this.tableauApp[this.nbApplication] = app;
        this.nbApplication++;
    }

    public void desinstallation(Application app) throws NotFound {
    	if (app instanceof Desinstallable) {
    		int i = 0;
    		while (i < 1000 && (app.equals(this.tableauApp[i]))) {
    			i ++;
    		}
    	if(i<1000)
    		for (int e = i;e<this.tableauApp.length;e++) {
    			this.tableauApp[i] = this.tableauApp[i+1];
    		}
    	else
    		throw new NotFound("Cannnot find this app");
    	
    	
    	}
    }

}
	
	


