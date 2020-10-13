public  class Point  {

    private int abscisse;

    private int ordonnée;

    public Point(int abscisse, int ordonnée) {
        this.abscisse = abscisse;
        this.ordonnée = ordonnée;
    }

    public int getAbscisse() {
        return this.abscisse;
    }

    public int getOrdonnée() {
        return this.ordonnée;
    }
    
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.abscisse- p1.abscisse, 2.0)
                + Math.pow(p2.ordonnée - p1.ordonnée, 2.0));
    }

}
