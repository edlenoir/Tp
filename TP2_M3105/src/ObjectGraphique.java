
public class ObjectGraphique implements Cloneable {
	private double coordX;
	private double coordY;
	
	
	public void translater(double coordX,double coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public ObjectGraphique(double coordX, double coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
	}



	@Override
	public String toString() {
		return "ObjectGraphique [coordX=" + coordX + ", coordY=" + coordY + "]";
	}
	
	public ObjectGraphique clone() {
		ObjectGraphique clone = null;
		try {
			clone = (ObjectGraphique) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
		 
	}    

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectGraphique other = (ObjectGraphique) obj;
		if (Double.doubleToLongBits(coordX) != Double.doubleToLongBits(other.coordX))
			return false;
		if (Double.doubleToLongBits(coordY) != Double.doubleToLongBits(other.coordY))
			return false;
		return true;
	}
	
}
