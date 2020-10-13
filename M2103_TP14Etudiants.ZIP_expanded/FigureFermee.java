import java.awt.Graphics;

public interface class FigureFermee implements Figure {

    private Point point1;
    private Point point2;

    public FigureFermee(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getP1() {
        return this.point1;
    }

    public Point getP2() {
        return this.point2;
    }

}
