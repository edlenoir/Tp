import java.util.ArrayList;

public class Telephone {
	private String[] caracteres = { "0 ", "1", "2abc", "3def", "4ghi","5jkl", "6mno", "7pqrs", "8tuv", "9wxyz" }; 
	
	private ArrayList<Touche> tel;

	public Telephone(String[] caractères, ArrayList<Touche> tel) {
		this.tel = new ArrayList<>();
		for (String temp : caracteres) {
			this.tel.add(new Touche(temp));
		}
	}
}
