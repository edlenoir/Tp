
public class Menu  implements Cloneable {
	private Principal prin;
	private Accompagnement acc;
	private Boisson bois;
	
	private Menu() {
	}

	public static Menu initializeMenu(Principal newprin, Accompagnement newacc, Boisson newbois) {
		Menu menu = new Menu();
        menu.prin = newprin;
        menu.acc = newacc;
        menu.bois = newbois;
        return menu;	
	}

	public void setAccompagnement(Accompagnement acc) {
		this.acc = acc;
	}

	public void setPrincipal(Principal prin) {
		this.prin = prin;
	}

	public void setBoisson(Boisson bois) {
		this.bois= bois;		
	}

	public Accompagnement getAccompagnement() {
		return this.acc;
	}

	public Principal getPrincipal() {
		return this.prin;
	}
	
	public Boisson getBoisson() {
		return this.bois;
	}
	
	   @Override
	    protected Menu clone() {
	        Menu clone = null;
	        try {
	            clone = (Menu) super.clone();
	            clone.setAccompagnement((Accompagnement) clone.getAccompagnement().clone());
	            clone.setBoisson((Boisson) clone.getBoisson().clone());
	            clone.setPrincipal((Principal) clone.getPrincipal().clone());
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	        return clone;
	    }

	@Override
	public String toString() {
		return "Menu [prin=" + prin + ", acc=" + acc + ", bois=" + bois + "]";
	}
	

}
