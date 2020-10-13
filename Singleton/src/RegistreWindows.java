
public class RegistreWindows {
	
	private String nomRegistre;
	private static RegistreWindows monRegistre ;
	
	private RegistreWindows(String nomRegistre) {
		
		this.nomRegistre = nomRegistre;
	}

	@Override
	public String toString() {
		return "RegistreWindows [nomRegistre=" + nomRegistre + "]";
	}

	public String getNomRegistre() {
		return nomRegistre;
	}

	public void setNomRegistre(String nomRegistre) {
		this.nomRegistre = nomRegistre;
	}
	
	public static synchronized RegistreWindows getInstance() {
		if(monRegistre == null)
			monRegistre = new RegistreWindows("par Défaut");
		return monRegistre;
	}
}
	
	
	

