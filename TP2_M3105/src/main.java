
public class main {
public static void main(String[] args) throws CloneNotSupportedException {
		Catalogue catalogue = Catalogue.getInstance();
		Cite uneCit� = catalogue.getCite();
		Immeuble test = (Immeuble) uneCit�.getList().get(0);
		test.setCouleur("Rouge");
		test.translater(3.3, 4.4);
		System.out.println(uneCit�);
		Cite uneAutreCit� = catalogue.getCite();
		System.out.println(uneAutreCit�);
		}

}
