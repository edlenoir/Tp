
public class Carte {
	private int code;
	private Compte compte;

	public Carte(int code, Compte compte) {
		this.compte =compte;
		this.code = code;
	}
	
	public boolean codeCorrect(int code) {
		return this.code == code;
	}

	public Compte getCompte() {
		return this.compte;
	}
}
