import java.awt.Graphics;
import java.util.ArrayList;

public class PolyligneOuverte implements Figure {
    
    private ArrayList<Point> liste;
    
    public PolyligneOuverte(Point... points) {
        this.liste = new ArrayList<Point>();
        for (int i = 0; i < points.length; i++) {
            if (!this.liste.contains(points[i]))
                this.liste.add(points[i]);
        }
    }
        
    @Override
    public void tracer(Graphics g) {
        for (int i = 0; i < this.liste.size() - 1; i++) { 
            Point p1 = this.liste.get(i); 
            Point p2 = this.liste.get(i + 1); 
            g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY()); 
        }
    }

}