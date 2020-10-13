public class ColoredPoint  implements IColoredPoint {
	private Color couleur;
	private IPoint point;

	
	public static final ColoredPoint POINT_ORIGINE = new ColoredPoint(0.0F, 0.0F, 0 , 0, 0);
	
	public ColoredPoint(float abscisse, float ordinate, int red, int green, int blue)
			throws IllegalArgumentException {
			this.point = new Point(abscisse, ordinate);
			this.couleur = new Color(red,green,blue);
	}
			public ColoredPoint(float abscisse, float ordinate, Color color) {
			this.point = new Point(abscisse, ordinate);
			this.couleur = color;
}
			
	@Override
	public int getRed() {
		return this.couleur.getRed();
	}
	
	@Override
	public int getGreen() {
		return this.couleur.getGreen();
	}
	
	@Override
	public int getBlue() {
		return this.couleur.getBlue();
	}
	
	@Override
	public void setRed(int red) throws IllegalArgumentException {
		this.couleur.setRed(red);
	}
	
	@Override
	public void setGreen(int green) throws IllegalArgumentException {
		this.couleur.setGreen(green);
	}
	
	@Override
	public void setBlue(int blue) throws IllegalArgumentException  {
		this.couleur.setBlue(blue);
	}

	@Override
	public String toString () {
		return super.toString() + this.couleur.toString();
	}
	public float getAbscisse() {
		return this.point.getAbscisse();
		}
		public float getOrdinate() {
		return this.point.getOrdinate();
		}
		public void translate(float tx, float ty) {
		this.point.translate(tx, ty);
		}
		public void toScale(float h) throws IllegalArgumentException {
		this.point.toScale(h);
		} 
		
	
}
