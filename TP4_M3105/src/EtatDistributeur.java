

public class EtatDistributeur {

	private int nb50Disponible;
	private int nb20Disponible;
	private int nb10Disponible;
	private int nb5Disponible;
	
	public EtatDistributeur() {
		this.nb50Disponible = 0;
		this.nb20Disponible = 0;
		this.nb10Disponible = 0;
		this.nb5Disponible = 0;
		
	}

	public void setNb5Disponible(int nb5Disponible) {
		this.nb5Disponible = nb5Disponible;
	}

	public int getNb50Disponible() {
		return nb50Disponible;
	}

	public void setNb50Disponible(int nb50Disponible) {
		this.nb50Disponible = nb50Disponible;
	}

	public int getNb20Disponible() {
		return nb20Disponible;
	}

	public void setNb20Disponible(int nb20Disponible) {
		this.nb20Disponible = nb20Disponible;
	}

	public int getNb10Disponible() {
		return nb10Disponible;
	}

	public void setNb10Disponible(int nb10Disponible) {
		this.nb10Disponible = nb10Disponible;
	}

	public int getNb5Disponible() {
		return nb5Disponible;
	}

}
