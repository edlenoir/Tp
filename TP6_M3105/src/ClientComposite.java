public class ClientComposite {
//calcul de l'expression arihmétique 2 + (3 * (5 -2)) * 6 /6 + 7
	public static void main(String[] args) {
		ExpressionArithmetique complete;
		complete = new ExpressionPlus();
		complete.add(new Entier(2));
		ExpressionArithmetique milieu = new ExpressionDiv();
		complete.add(milieu);
		complete.add(new Entier(7));
		ExpressionArithmetique droitediv = new ExpressionMult();
		milieu.add(droitediv);
		milieu.add(new Entier(6));
		droitediv.add(new Entier(3));
		ExpressionArithmetique soustraction = new ExpressionMoins();
		droitediv.add(soustraction);
		droitediv.add(new Entier(6));
		soustraction.add(new Entier(5));
		soustraction.add(new Entier(2));
		System.out.println("2 + (3 * (5 -2)) * 6 /6 + 7 = " +
		complete.evaluate());
}
}
