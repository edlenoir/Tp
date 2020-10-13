import java.util.List;
import javax.swing.JFrame;

public class FenetreFigures extends JFrame {

    public FenetreFigures(List<Figure> figures) {
        this.setTitle("tracés");
        this.setContentPane(new PanneauFigures(figures));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500, 500);
    }
    
}
