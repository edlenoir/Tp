
public class Main {

	public static void main(String[] args) {
		        CompteBancaire c1 = new CompteCourant("Compte Bancaire 001", Devise.EUR,true);
		        CompteBancaire c2 = new CompteCourant("Compte Bancaire 002", Devise.USD,true);
		        CompteBancaire c3 = new CompteEpargneLogement("Compte Epargne Logement 001", Devise.EUR,false);
		        CompteBancaire c4 = new CompteEpargneLogement("Compte Epargne Logement 002", Devise.USD,false);
		        
		        try {
					c1.créditer(new Couple<>(Devise.EUR, 15D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c1);
		        try {
					c1.créditer(new Couple<>(Devise.USD, 10D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c1);
		        try {
					c1.débiter(new Couple<>(Devise.EUR, 15D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c1);
		        try {
					c1.débiter(new Couple<>(Devise.USD, 10D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c1);
		        
		        System.out.println("------------------------------------------------");
		        
		        try {
					c2.créditer(new Couple<>(Devise.EUR, 500D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c2);
		        try {
					c2.créditer(new Couple<>(Devise.USD, 300D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c2);
		        try {
					c2.débiter(new Couple<>(Devise.EUR, 500D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c2);
		        try {
					c2.débiter(new Couple<>(Devise.USD, 300D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c2);
		        System.out.println("------------------------------------------------");
		        try {
					c3.créditer(new Couple<>(Devise.EUR, 200D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c3);
		        try {
					c3.créditer(new Couple<>(Devise.USD, 100D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c3);
		        try {
					c3.débiter(new Couple<>(Devise.EUR, 200D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c3);
		        try {
					c3.débiter(new Couple<>(Devise.USD, 100D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c3);
		        
		        System.out.println("------------------------------------------------");
		        
		        try {
					c4.créditer(new Couple<>(Devise.EUR, 150D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c4);
		        try {
					c4.créditer(new Couple<>(Devise.USD, 10.5D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c4);
		        try {
					c4.débiter(new Couple<>(Devise.EUR, 150D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c4);
		        try {
					c4.débiter(new Couple<>(Devise.USD, 10.5D));
				} catch (ParametreInvalide e) {
					e.printStackTrace();
				}
		        System.out.println(c4);
		    }


	}

