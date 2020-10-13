public class PremierPaysage {
public static void main(String[] args) throws CloneNotSupportedException {
Catalogue catalogue = Catalogue.getInstance();
ObjectGraphique[] paysage = {
							catalogue.getImmeuble(),
							catalogue.getArbre(),
							catalogue.getBanc(),
							catalogue.getBalancoire(),
							catalogue.getToboggan(),
							catalogue.getTourniquet()};
for (ObjectGraphique o : paysage) {
o.translater(Math.random() * 10, Math.random() * 10);
System.out.println(o);
}
}
}