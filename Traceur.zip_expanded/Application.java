import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<Figure>();
        figures.add(new Rectangle(50, 50, 100, 100, Color.ORANGE));
        figures.add(new Cercle(200, 300, 200, 150 , Color.BLUE));
        figures.add(new Rectangle(90, 90, 450,350));
        figures.add(new Cercle(120, 250, 120, 300));
        figures.add(new Cercle(100, 100, 0, 100,Color.RED));
        figures.add(new Triangle(200, 400, 300, 100, 100, 250,Color.RED));
        new FenetreFigures(figures);
    }
    
}
