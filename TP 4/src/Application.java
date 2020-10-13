import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) throws FileNotFoundException {
		TableMots tabMots = new TableMots();
		Scanner sc = new Scanner(new FileReader("./src/chaviro.txt"));
		try {	
			while (sc.hasNext()) {
				tabMots.enregistrerMot(new Mot(sc.next()));
			}
		}
		catch (TableMotsPleine e) {
			System.out.println(e);
		}
		System.out.println(tabMots);
		sc.close();
	}

}
