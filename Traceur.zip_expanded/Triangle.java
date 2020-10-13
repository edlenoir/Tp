import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public class Triangle extends Figure {
	
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3,  Color couleur) {
    	super(couleur);
    	this.ajouterPoint(new Point(x1, y1));
    	this.ajouterPoint(new Point(x2, y2));
    	this.ajouterPoint(new Point (x3, y3));
    }
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    	this(x1, y1, x2, y2, x3, y3, Color.BLACK);
    }

	@Override
	public void tracer(Graphics g) {
		Polygon triangle = new Polygon();
		List<Point> points = this.getPoints();
		for (Point p : points)
			triangle.addPoint(p.getAbscisse(), p.getOrdonnée());
		g.drawPolygon(triangle);
	}

}
