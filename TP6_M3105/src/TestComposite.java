import static org.junit.Assert.*;

import org.junit.Test;

public class TestComposite {

	@Test
	public void testPositif() {
		Entier e = new Entier(7) ;
		assertEquals(7,e.evaluate());
	}
	
	@Test
	public void testNeutre() {
		Entier e = new Entier(0) ;
		assertEquals(0,e.evaluate());
	}

	
	@Test
	public void testNegatif() {
		Entier e = new Entier(-7) ;
		assertEquals(-7,e.evaluate());
	}
	
	@Test
	public void testExpressionPlus1Valeur() {
		Entier e = new Entier(1) ;
		ExpressionPlus ep = new ExpressionPlus();
		ep.add(e);
		assertEquals(1,ep.evaluate());
	}
	
	@Test
	public void testExpressionPlus2Valeur() {
		Entier e1 = new Entier(5) ;
		Entier e2 = new Entier(7) ;
		ExpressionPlus ep = new ExpressionPlus();
		ep.add(e1);
		ep.add(e2);
		assertEquals(12,ep.evaluate());
	}
	
	@Test
	public void testExpressionPlus3Valeur() {
		Entier e1 = new Entier(1) ;
		Entier e2 = new Entier(2) ;
		Entier e3 = new Entier(-3) ;
		ExpressionPlus ep = new ExpressionPlus();
		ep.add(e1);
		ep.add(e2);
		ep.add(e3);
		assertEquals(0,ep.evaluate());
	}
	
	@Test
	public void testExpressionMoins1Valeur() {
		Entier e1 = new Entier(1) ;
		ExpressionMoins em = new ExpressionMoins();
		em.add(e1);
		assertEquals(1,em.evaluate());
	}
	@Test
	public void testExpressionMoins2Valeur() {
		Entier e1 = new Entier(5) ;
		Entier e2 = new Entier(7) ;
		ExpressionMoins em = new ExpressionMoins();
		em.add(e1);
		em.add(e2);
		assertEquals(-2,em.evaluate());
	}
	@Test
	public void testExpressionMoins3Valeur() {
		Entier e1 = new Entier(1) ;
		Entier e2 = new Entier(2) ;
		Entier e3 = new Entier(-3) ;
		ExpressionMoins em = new ExpressionMoins();
		em.add(e1);
		em.add(e2);
		em.add(e3);
		assertEquals(2,em.evaluate());
	}
	
	
	@Test
	public void testExpressionMult1Valeur() {
		Entier e1 = new Entier(1) ;
		ExpressionMult emult = new ExpressionMult();
		emult.add(e1);
		assertEquals(1,emult.evaluate());
	}
	@Test
	public void testExpressionMult2Valeur() {
		Entier e1 = new Entier(5) ;
		Entier e2 = new Entier(7) ;
		ExpressionMult emult = new ExpressionMult();
		emult.add(e1);
		emult.add(e2);
		assertEquals(35,emult.evaluate());
	}
	@Test
	public void testExpressionMult3Valeur() {
		Entier e1 = new Entier(1) ;
		Entier e2 = new Entier(2) ;
		Entier e3 = new Entier(-3) ;
		ExpressionMult emult = new ExpressionMult();
		emult.add(e1);
		emult.add(e2);
		emult.add(e3);
		assertEquals(-6,emult.evaluate());
	}
	
	@Test
	public void testExpressionDiv1Valeur() {
		Entier e1 = new Entier(1) ;
		ExpressionDiv ediv = new ExpressionDiv();
		ediv.add(e1);
		assertEquals(1,ediv.evaluate());
	}
	@Test
	public void testExpressionDiv2Valeur() {
		Entier e1 = new Entier(15) ;
		Entier e2 = new Entier(5) ;
		ExpressionDiv ediv = new ExpressionDiv();
		ediv.add(e1);
		ediv.add(e2);
		assertEquals(3,ediv.evaluate());
	}
	@Test
	public void testExpressionDiv3Valeur() {
		Entier e1 = new Entier(24);
		Entier e2 = new Entier(2);
		Entier e3 = new Entier(-3);
		ExpressionDiv emdiv = new ExpressionDiv();
		emdiv.add(e1);
		emdiv.add(e2);
		emdiv.add(e3);
		assertEquals(-4,emdiv.evaluate());
	}
	@Test (expected = ArithmeticException.class)
	public void testArithmeticException() throws ArithmeticException {
		Entier e1 = new Entier(24);
		Entier e2 = new Entier(0);
		ExpressionDiv ediv = new ExpressionDiv();
		ediv.add(e1);
		ediv.add(e2);
		ediv.evaluate();
	}
	
	@Test
	public void testAcceptation() {
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
		assertEquals(18,complete.evaluate());

	}
	
	
	




}
