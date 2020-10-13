import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDistributeurTest {
	
	@Test
	public void testBillets10() {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(10);
		assertEquals(0, d.montantRestantDu(proposition, 10));
		assertEquals(10, proposition.get(0).getValeurBillet());
		assertEquals(1, proposition.get(0).getNombreBilletsDelivres());
	}
	
	@Test
	public void testBillets50() {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(50);
		assertEquals(0, d.montantRestantDu(proposition, 50));
		assertEquals(20, proposition.get(0).getValeurBillet());
		assertEquals(2, proposition.get(0).getNombreBilletsDelivres());
		assertEquals(10, proposition.get(1).getValeurBillet());
		assertEquals(1, proposition.get(1).getNombreBilletsDelivres());
	}
	
	@Test
	public void testBillets20() {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(20);
		assertEquals(0, d.montantRestantDu(proposition, 20));
		assertEquals(10, proposition.get(0).getValeurBillet());
		assertEquals(2, proposition.get(0).getNombreBilletsDelivres());
	}
	
	@Test
	public void testBillets60() {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(60);
		assertEquals(0, d.montantRestantDu(proposition, 60));
		assertEquals(20, proposition.get(0).getValeurBillet());
		assertEquals(2, proposition.get(0).getNombreBilletsDelivres());
		assertEquals(10, proposition.get(1).getValeurBillet());
		assertEquals(2, proposition.get(1).getNombreBilletsDelivres());
	}
	
	@Test
	public void testBillets30() {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(30);
		assertEquals(0, d.montantRestantDu(proposition, 30));
		assertEquals(20, proposition.get(0).getValeurBillet());
		assertEquals(1, proposition.get(0).getNombreBilletsDelivres());
		assertEquals(10, proposition.get(1).getValeurBillet());
		assertEquals(1, proposition.get(1).getNombreBilletsDelivres());
	}
	
	@Test
	public void testBillets40() {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(40);
		assertEquals(0, d.montantRestantDu(proposition, 40));
		assertEquals(20, proposition.get(0).getValeurBillet());
		assertEquals(1, proposition.get(0).getNombreBilletsDelivres());
		assertEquals(10, proposition.get(1).getValeurBillet());
		assertEquals(2, proposition.get(1).getNombreBilletsDelivres());
	}
	
	@Test
	public void testBillets70() {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(70);
		assertEquals(0, d.montantRestantDu(proposition, 70));
		assertEquals(20, proposition.get(0).getValeurBillet());
		assertEquals(3, proposition.get(0).getNombreBilletsDelivres());
		assertEquals(10, proposition.get(1).getValeurBillet());
		assertEquals(1, proposition.get(1).getNombreBilletsDelivres());
	}
	
	@Test
	public void testBillets100() {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(100);
		assertEquals(0, d.montantRestantDu(proposition, 100));
		assertEquals(50, proposition.get(0).getValeurBillet());
		assertEquals(1, proposition.get(0).getNombreBilletsDelivres());
		assertEquals(20, proposition.get(1).getValeurBillet());
		assertEquals(2, proposition.get(1).getNombreBilletsDelivres());
		assertEquals(10, proposition.get(2).getValeurBillet());
		assertEquals(1, proposition.get(2).getNombreBilletsDelivres());
	}
	
	@Test
	public void testBillets110() {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(110);
		assertEquals(0, d.montantRestantDu(proposition, 110));
		assertEquals(50, proposition.get(0).getValeurBillet());
		assertEquals(1, proposition.get(0).getNombreBilletsDelivres());
		assertEquals(20, proposition.get(1).getValeurBillet());
		assertEquals(2, proposition.get(1).getNombreBilletsDelivres());
		assertEquals(10, proposition.get(2).getValeurBillet());
		assertEquals(2, proposition.get(2).getNombreBilletsDelivres());
	}
	
	@Test
	public void testBillets210() {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(210);
		assertEquals(0, d.montantRestantDu(proposition, 210));
		assertEquals(50, proposition.get(0).getValeurBillet());
		assertEquals(2, proposition.get(0).getNombreBilletsDelivres());
		assertEquals(20, proposition.get(1).getValeurBillet());
		assertEquals(5, proposition.get(1).getNombreBilletsDelivres());
		assertEquals(10, proposition.get(2).getValeurBillet());
		assertEquals(1, proposition.get(2).getNombreBilletsDelivres());
	}
	
	@Test
	public void testBillets310() {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(310);
		assertEquals(0, d.montantRestantDu(proposition, 310));
		assertEquals(50, proposition.get(0).getValeurBillet());
		assertEquals(3, proposition.get(0).getNombreBilletsDelivres());
		assertEquals(20, proposition.get(1).getValeurBillet());
		assertEquals(7, proposition.get(1).getNombreBilletsDelivres());
		assertEquals(10, proposition.get(2).getValeurBillet());
		assertEquals(2, proposition.get(2).getNombreBilletsDelivres());
	}
	
	@Test
	public void testBillets3000() {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(3000);
		assertEquals(2200, d.montantRestantDu(proposition, 3000));
		assertEquals(50, proposition.get(0).getValeurBillet());
		assertEquals(10, proposition.get(0).getNombreBilletsDelivres());
		assertEquals(20, proposition.get(1).getValeurBillet());
		assertEquals(10, proposition.get(1).getNombreBilletsDelivres());
		assertEquals(10, proposition.get(2).getValeurBillet());
		assertEquals(10, proposition.get(2).getNombreBilletsDelivres());
	}
	

}


