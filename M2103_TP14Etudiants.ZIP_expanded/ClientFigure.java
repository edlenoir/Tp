import java.util.ArrayList;
import java.util.List;

public class ClientFigure {

    public static void main(String[] args) {
        List<FigureFermee> liste = new ArrayList<FigureFermee>();
        liste.add(new Rectangle(new Point(0,0),new Point(100,100)));
        liste.add(new Cercle(new Point(100,100), new Point(100,300)));
        FenetreFigures dessin = new FenetreFigures(liste);
    }

}