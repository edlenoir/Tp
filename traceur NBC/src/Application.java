import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        
        FabriquePointC fabriqueRouge = new FabriquePointC(Color.RED);
        
        FabriquePointC fabriqueOrange = new FabriquePointC(Color.ORANGE);
        
        FabriquePointC fabriqueBleu = new FabriquePointC(Color.BLUE);
        
        FabriquePointNB fabriqueNoir = new FabriquePointNB();
        

        List<Figure> figures = new ArrayList<Figure>();
        figures.add(new Rectangle(50, 50, 100, 100, fabriqueOrange));
        
        figures.add(new Cercle(200, 300, 200, 150, fabriqueBleu));
        
        figures.add(new Rectangle(90, 90, 450, 350,fabriqueNoir));
        
        figures.add(new Cercle(120, 250, 120, 300, fabriqueNoir));
        
        figures.add(new Cercle(100, 100, 0, 100, fabriqueRouge));
        
        figures.add(new Triangle(200, 400, 300, 100, 100, 250, fabriqueRouge));
        
        new FenetreFigures(figures);
    }
    
}
