import java.awt.Graphics;
public class Cercle extends FigureFermee{
	
	

	 public Cercle(Point p1, Point p2) {
		 super(p1,p2);
	 }
	
	public double rayons() {
		return Point.distance(this.getP1(), this.getP2());
	}
	
	public double diametre() {
		return Point.distance(this.getP1(), this.getP2())* 2;
	}
	
	public double perimetre() {
		return (2*Math.PI )* Point.distance(this.getP1(), this.getP2());
	}
	
	public double  surface() {
		return Math.PI * Point.distance(this.getP1(), this.getP2());
	}
	
	public void tracer(Graphics g) {
        int n = (int)this.diametre();
        g.drawOval(this.getP1().getX(),this.getP1().getY(), n, n);
    }

	
}
