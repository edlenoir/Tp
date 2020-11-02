
public class CheeseCake implements Cake {
	
	
	private String sugar;
	private String butter;
	private String cheese;
	private String name;
	

	public Cake prepareCake()  {
		Cake clone = null;
		try {
			clone = (Cake) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
		
	}

	public void addSugar(String sugar) {
		this.sugar = sugar;
		
	}

	public void addButter(String butter) {
		this.butter = butter;
		
	}

	public void addCheese(String cheese) {
		this.cheese = cheese;
		
	}

	public void setCustomer(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CheeseCake [sugar=" + sugar + ", butter=" + butter + ", cheese=" + cheese + ", name=" + name + "]" + "\n";
	}
	

}
