
public class main {
	public static void main (String[] args) {
		Telephone t = new Telephone();
		try {
			System.out.println(t.decode("6622999"));
		} catch (ListeVide e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
