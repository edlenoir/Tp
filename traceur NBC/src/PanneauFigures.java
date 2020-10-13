import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

public class PanneauFigures extends JPanel {
	
    private List<Figure> figures;

    public PanneauFigures(List<Figure> figures) {
        this.figures = figures;
    }

    public void paint(Graphics g) {
        for (Figure f : this.figures) {
            g.setColor(f.getCouleur());
            f.tracer(g);
        }
    }
}
