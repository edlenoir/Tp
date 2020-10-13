
public class main {
public static void main(String[] args) throws CloneNotSupportedException {
		Catalogue catalogue = Catalogue.getInstance();
		Cite uneCité = catalogue.getCite();
		Immeuble test = (Immeuble) uneCité.getList().get(0);
		test.setCouleur("Rouge");
		test.translater(3.3, 4.4);
		System.out.println(uneCité);
		Cite uneAutreCité = catalogue.getCite();
		System.out.println(uneAutreCité);
		}

}
