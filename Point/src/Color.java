public class Color {
	
	private int red;
	private int green;
	private int blue;
	
	public static final Color RED = new Color (255, 0, 0);
	public static final Color GREEN = new Color (0, 255, 0);
	public static final Color BLUE = new Color (0, 0, 255);
	
	public Color (int rouge, int vert, int bleu) throws IllegalArgumentException {
		this.setRed(rouge);
		this.setGreen(vert);
		this.setBlue(bleu);
	}
	
	public int getRed() {
		return (this.red);
	}
	
	public int getGreen() {
		return (this.green);
	}
	
	public int getBlue() {
		return (this.blue);
	}
	
	public int getRVB() {
		return this.red * 256 * 256 + this.green * 256 + this.blue;
	}
	
	public void setRed(int red) throws IllegalArgumentException {
		if (red < 0 || red > 255)
			throw new IllegalArgumentException ("mauvaise nuance de rouge " + red);
		this.red = red;
	}
	
	public void setGreen(int green) throws IllegalArgumentException {
		if (green < 0 || green > 255)
			throw new IllegalArgumentException ("mauvaise nuance de vert " + green);
		this.green = green;
	}
	
	public void setBlue(int blue) throws IllegalArgumentException {
		if (blue < 0 || blue > 255)
			throw new IllegalArgumentException ("mauvaise nuance de bleu " + blue);
		this.blue = blue;
	}

	@Override
	public String toString() {
		return "Couleur [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}
	
}
