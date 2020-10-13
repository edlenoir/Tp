import java.awt.Color;

public class PointC extends Point {
	
	private Color Color;
	
    public PointC(int abscisse, int ordonnée,Color c) {
    	super(ordonnée,abscisse);
    	this.Color = c;
       
    }
    
	public Color getCouleur() {
		return Color;
	}

}
