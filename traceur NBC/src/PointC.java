import java.awt.Color;

public class PointC extends Point {
	
	private Color Color;
	
    public PointC(int abscisse, int ordonn�e,Color c) {
    	super(ordonn�e,abscisse);
    	this.Color = c;
       
    }
    
	public Color getCouleur() {
		return Color;
	}

}
