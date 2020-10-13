public class Point implements IPoint {
	
	private float abscisse;
	private float ordinate;
	public static final IPoint POINT_ORIGINE = new Point(0.0F, 0.0F);
	
	public Point(float abscisse, float ordinate) {
		this.abscisse = abscisse;
		this.ordinate = ordinate;
	}
	
	@Override
	public float getAbscisse() {
		return this.abscisse;
	}
	
	@Override
	public float getOrdinate() {
		return this.ordinate;
	}
	
	@Override
	public void translate(float tx, float ty) {
		this.abscisse += tx;
		this.ordinate += ty;
	}
	
	@Override
	public void toScale(float h) throws IllegalArgumentException {
		if (h <= 0.0F)
			throw new IllegalArgumentException("facteur erroné" + h);
		this.abscisse *= h;
		this.ordinate *= h;
	}

	@Override
	public String toString() {
		return "Point [abscisse=" + abscisse + ", ordinate=" + ordinate + "]";
	}
	
}
