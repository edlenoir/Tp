package Journalisation;


public class TestComptesBancaires {

	public static void main(String[] args) {
        CompteBancaire cb1 = new CompteBancaire(123456789);
        CompteBancaire cb2 = new CompteBancaire(987654321);
        cb1.déposer(100);
        cb2.retirer(10);
        cb1.retirer(80);
        cb2.déposer(-1.33);
        cb2.déposer(18.8);
        cb1.retirer(-150.0);
        
        System.out.println(Journal.getInstance(1));
        System.out.println(Journal.getInstance(2));
	}

}
