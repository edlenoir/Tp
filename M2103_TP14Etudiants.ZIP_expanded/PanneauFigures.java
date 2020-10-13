import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

public class PanneauFigures extends JPanel {
    private static final long serialVersionUID = -5633501983987020072L;
    private List<FigureFermee> figures;

    public PanneauFigures(List<FigureFermee> figures) {
        this.figures = figures;
    }

    public void paint(Graphics g) {
        Color[] tableauCouleur = { Color.RED, Color.BLACK, Color.BLUE,
                Color.GREEN, Color.MAGENTA, Color.ORANGE, Color.PINK };
        int i = 0;
        for (FigureFermee f : this.figures) {
            g.setColor(tableauCouleur[i % 10]);
            f.tracer(g);
            i++;
        }
    }
}
