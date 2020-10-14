import java.io.ObjectInputStream.GetField;

public class main {
	public static void main(String[] args)  {
	Labyrinthe l = new Labyrinthe();
	l.afficherlab();
	l.existeChemin(6, 8);
	System.out.println(l.getDirection());
}
}