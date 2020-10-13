public  class Point  {

    private int abscisse;

    private int ordonn�e;

    public Point(int abscisse, int ordonn�e) {
        this.abscisse = abscisse;
        this.ordonn�e = ordonn�e;
    }

    public int getAbscisse() {
        return this.abscisse;
    }

    public int getOrdonn�e() {
        return this.ordonn�e;
    }
    
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.abscisse- p1.abscisse, 2.0)
                + Math.pow(p2.ordonn�e - p1.ordonn�e, 2.0));
    }

}
