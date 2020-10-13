import java.awt.Graphics;
public class Rectangle extends FigureFermee {
    
 

    public Rectangle(Point p1, Point p2) {
    	super(p1,p2);
    }


	public int largeur () {
		return Math.abs(this.getP2().getX() - this.getP1().getX());
    }

    
	
	public int hauteur() {
		return Math.abs(this.getP2().getY() - this.getP1().getY());
	}
	
	public double perimetre () {
		        return 2*Math.abs(this.getP2().getX() - this.getP1().getX()) + Math.abs(this.getP2().getY() - this.getP1().getY());
   }
	
	
	public double surface () {
		return Math.abs(this.getP2().getX() - this.getP1().getX()*this.getP2().getY() - this.getP1().getY());
	}
	
	public void tracer(Graphics g) {
		g.drawRect(this.getP1().getX(), this.getP1().getY(), this.largeur(), this.hauteur());    
    } 
}